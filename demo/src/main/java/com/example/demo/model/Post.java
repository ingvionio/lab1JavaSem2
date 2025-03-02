package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public Long getId(){
        return id;
    }

    public String getText(){
        return  text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
