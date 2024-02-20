package com.egisatria.simpleblog.repository;

import java.io.Serializable;
import java.util.List;

import com.egisatria.simpleblog.vo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("commentJpaRepository")
public interface CommentJpaRepository extends JpaRepository<Comment, Serializable>{
    List<Comment> findByPostIdOrderByRegDateDesc(Long postId);
    Comment findOneById(Long id);
    List<Comment> findByPostIdAndCommentContainingOrderByRegDateDesc(Long postId, String query);

}

