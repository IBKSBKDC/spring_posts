package kr.re.kitri.spring_posts.service;

import kr.re.kitri.spring_posts.model.Post;

import java.util.List;

public interface PostService {

    // 전체글 보기
    Iterable<Post> viewAllPosts();
    // 글 상세보기 by ID
    Post viewPostById(long postId);
    // 글 등록
    Post registerPost(Post post);
    // 글 수정

    // 글 삭제

    // 좋아요..
    void updateLikesPlusOne(long postId);

}