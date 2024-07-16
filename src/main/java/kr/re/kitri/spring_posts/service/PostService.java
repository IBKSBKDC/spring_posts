package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 전체 글보기
    public String viewAllPosts(){
        return postRepository.selectAllPost();
    }
    // 상세 글보기 By ID

    // 글 등록

    // 글 수정

    // 글 삭제

    // 좋아요
}
