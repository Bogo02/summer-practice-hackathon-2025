package com.example.HGHack.Service;

import com.example.HGHack.Post.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

public class CommentService {
    public List<Comment> comments = new ArrayList<>();
    public long commentID = 1L;

    public List<Comment> getComments() {
        return comments;
    }
    public Comment createComment(Comment comment) {
        comments.add(comment);
        commentID = commentID + 1;
        return comment;
    }

}
