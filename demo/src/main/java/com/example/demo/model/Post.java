package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes = 2;

    public Post(String text){
        this.text = text;

    }

    public String GetText(){
        return  text;
    }

    public Integer GetLikes(){
        return likes;
    }
}
