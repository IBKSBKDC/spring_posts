package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.model.Post;
import kr.re.kitri.spring_posts.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PostServiceImpl implements PostService {

    //private static final Logger log = LoggerFactory.getLogger(PostServiceImpl.class);

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 전체글 보기
    public Iterable<Post> viewAllPosts() {
        log.info("롬복 좋아요..");
        return postRepository.findAll();
    }
    // 글 상세보기 by ID
    public Post viewPostById(long postId) {
        Optional<Post> post = postRepository.findById(postId);
        return post.orElse(null);
    }

    // 글 등록
    public Post registerPost(Post post) {
        return postRepository.save(post);
    }


    // 글 수정

    // 글 삭제

    // 좋아요..
    public void updateLikesPlusOne(long postId) {
        postRepository.increaseLikes(postId);
    }
}