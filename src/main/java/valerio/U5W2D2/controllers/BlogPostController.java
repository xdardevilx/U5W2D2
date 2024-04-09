package valerio.U5W2D2.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import valerio.U5W2D2.entities.BlogPost;
import valerio.U5W2D2.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    private List<BlogPost> getBlogpostList(){
        return this.blogPostService.getBlogPostList();
    }

    @GetMapping("/{bloPostId}")
    private BlogPost getSingleBlogpost(int blogPostId){
        return this.blogPostService.getSingleBlogPost(blogPostId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(BlogPost post){
        return this.blogPostService.saveBlogPost(post);
    }

    @PutMapping("/{blogPostId}")
    private BlogPost updateBlogPost(int postId, BlogPost updatePost){
        return this.blogPostService.updateBlogPost(postId, updatePost);
    }

    @DeleteMapping
    private void deleteBlogPost(int postId){
        this.blogPostService.deleteBlogPostById(postId);
    }





}
