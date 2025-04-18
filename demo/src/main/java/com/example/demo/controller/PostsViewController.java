package com.example.demo.controller;


import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    @Autowired
    PostService postsService;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Мой сайт");
        model.addAttribute("posts", postsService.listAllPosts());

        return "list";
    }
}

