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
        return posts;
    }
}
