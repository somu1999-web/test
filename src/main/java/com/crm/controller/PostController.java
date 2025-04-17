package com.crm.controller;

import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public PostController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @PostMapping
    public String createPost(
            @RequestBody Post post
    ){
     postRepository.save(post);
     return "saved";
    }

//    http://localhost:8080/api/v1/posts?id=2
    @DeleteMapping
    public void deletePost(){

        postRepository.deleteById(1L);
    }
}
