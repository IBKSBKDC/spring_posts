package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.model.Post;
import kr.re.kitri.spring_posts.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PostService {

    //private static final Logger log = LoggerFactory.getLogger(PostService.class);

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 전체 글보기
    public List<Post> viewAllPosts(){
        log.info("롬복 좋아요");
        return postRepository.selectAllPost();
    }
    // 상세 글보기 By ID
    // 하나만 받아올거기 때문에 list가 아니다.
    public Post viewPost(long postId){
        return postRepository.selectPostById(postId);
    }

    // 글 등록
    public void registerPost(Post post) {
        System.out.println("[Service] : " + post.toString());
        postRepository.insertPost(post);
    }

    // 좋아요
    public Post updateLikesPlusOne(long postId) {
        return postRepository.updateLikesPulsOne(postId);
    }



    // 글 수정

    // 글 삭제


}
