package kr.re.kitri.spring_posts.controller;

import kr.re.kitri.spring_posts.model.Post;
import kr.re.kitri.spring_posts.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> allPosts(){
        log.info("[allPosts] : " + postService.viewAllPosts());
        System.out.println("[allPosts] : " + postService.viewAllPosts());
        return postService.viewAllPosts();
    }

    // localhost:8080/posts/2
    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        return postService.viewPost(postId);
    }

    // 글 등록
    @PostMapping("/posts")
    public void addPost(@RequestBody Post post) {
        System.out.println("[Controller] : " + post.toString());
        postService.registerPost(post);
    }

    @PatchMapping("/posts/{postId}/likes")
    public Post doLike(@PathVariable long postId) {
        System.out.println("여긴오나?");
        return postService.updateLikesPlusOne(postId);

    }


}
