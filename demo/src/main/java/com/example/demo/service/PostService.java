package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

//    @Autowired
//    public PostService(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
    public long id = 0l;

    public List<Post> listAllPosts() {
       // return posts;
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public  void create(final String text) {
        //posts.add(new Post((long) posts.size(), text, new Date()));
        Post post = new Post(id, text, new Date());
        id++;
        postRepository.save(post);
    }
}
