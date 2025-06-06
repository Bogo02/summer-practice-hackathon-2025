package com.example.HGHack.Service;

import com.example.HGHack.Post.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();
    private Long currentId = 1L;

    public List<Post> getAllPosts() {
        return posts;
    }
    public Post createPost(Post post) {
        post.setID(currentId++);
        posts.add(post);
        return post;
    }
}
