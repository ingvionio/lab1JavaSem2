package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("123");
        myList.add("12");
        myList.add("1");
        myList.add("123450");

        List<Post> Posts = new ArrayList<Post>();
        for (String s : myList) {
            Posts.add(new Post(s));

        }

        return Posts;
    }
}
