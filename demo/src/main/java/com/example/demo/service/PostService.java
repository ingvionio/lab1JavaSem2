package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    static List<Post> Posts = new ArrayList<Post>();

    public List<Post> listAllPosts() {
        ArrayList<String> myList = new ArrayList<String>();

        for (String s : myList) {
            Create(s);
        }

        return Posts;
    }

    public void Create(String text) {
        Posts.add(new Post((long)Posts.size(), text, new Date()));
    }
}
