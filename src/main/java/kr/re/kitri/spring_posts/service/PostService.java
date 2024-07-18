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


public interface PostService {

    // 전체글 보기
    Iterable<Post> viewAllPosts();
    // 글 상세보기 by ID
    Post viewPostById(long postId);
    // 글 등록
    Post registerPost(Post post);
    // 글 수정

    // 글 삭제

    // 좋아요
    void updateLikesPlusOne(long postId);

}