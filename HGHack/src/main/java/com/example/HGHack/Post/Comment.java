package com.example.HGHack.Post;

import com.example.HGHack.Post.Post;

public class Comment {
    private String comment;
    private String author;

    public Comment(String comment, String author) {
        this.comment = comment;
        this.author = author;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
