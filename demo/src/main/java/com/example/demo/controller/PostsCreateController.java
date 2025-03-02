package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsCreateController {

    private final PostService postService;

    // Инжектируем PostService через конструктор
    public PostsCreateController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @PostMapping
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text); // Используем инжектированный сервис
        return "redirect:/";
    }
}
