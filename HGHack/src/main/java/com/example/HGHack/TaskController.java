package com.example.HGHack;

import com.example.HGHack.Post.Post;
import com.example.HGHack.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class TaskController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getPosts(){
        return postService.getAllPosts();
    }
    @PostMapping
    public Post createPost(Post post) {
        return postService.createPost(post);
    }
}
