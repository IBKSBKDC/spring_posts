package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.model.Post;
import kr.re.kitri.spring_posts.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 전체 글보기
    public List<Post> viewAllPosts(){
        return postRepository.selectAllPost();
    }
    // 상세 글보기 By ID
    // 하나만 받아올거기 때문에 list가 아니다.
    public Post viewPost(long postId){
        return postRepository.selectPostById(postId);
    }

    // 글 등록

    // 글 수정

    // 글 삭제

    // 좋아요
}
