package com.sparta.submitHomwork.service;

import com.sparta.submitHomwork.domain.Post;
import com.sparta.submitHomwork.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {this.postRepository = postRepository;}

   // 모든 글 읽어오기
    public List<Post> getAllpost() {return postRepository.findAllByOrderByCreatedTimeDesc();}


    }

