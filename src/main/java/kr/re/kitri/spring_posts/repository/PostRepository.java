package kr.re.kitri.spring_posts.repository;

import kr.re.kitri.spring_posts.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {


    public List<Post> selectAllPost() {

        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post(1, "first post", "스프링 멋져요1", 2));
        posts.add(new Post(2, "second post", "스프링 멋져요2", 3));
        posts.add(new Post(3, "thrid post", "스프링 멋져요3", 5));
        posts.add(new Post(4, "four post", "스프링 멋져요4", 10));
        System.out.println("posts = " + posts);
        return posts;
    }

    public Post selectPostById(long postId) {
        return new Post(postId, "테스트제목","테스트바디",8);
    }

    public Post insertPost(Post post) {
        System.out.println("잘 등록되었습니다.");
        return post;
    }

    public Post updateLikesPulsOne(long postId) {
        // postId에 해당되는 글의 likes의 수를 1 증가
        // postId 글의 조회해서 그 글을 리턴한다.

        return new Post(postId,"dfdf","dfdf",1);
    }
}
