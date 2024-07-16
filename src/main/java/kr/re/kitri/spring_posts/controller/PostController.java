package kr.re.kitri.spring_posts.controller;

import kr.re.kitri.spring_posts.model.Post;
import kr.re.kitri.spring_posts.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> allPosts(){
        return postService.viewAllPosts();
    }
}
