package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void viewAllPosts() {

        Iterable<Post> posts = postService.viewAllPosts();

        Assertions.assertTrue(posts.iterator().hasNext());
    }

    @Test
    public void viewPostById() {
        // 상세보기를 실행한다.

        Post post = postService.viewPostById(2);
        Assertions.assertEquals(2,post.getId());
    }

    @Test
    public void registerPost(){
        // title="test", body
        // 반환된 Post의 title = "test" 인지 확인하여 맞으면 통과
        Post testPost = new Post("test","안녕하세요 테스트하고 있어요",0);
        Post savedPost = postService.registerPost(testPost);
        Assertions.assertEquals("test",savedPost.getTitle());
    }

    @Test
    public void updateLiks(){}
}
