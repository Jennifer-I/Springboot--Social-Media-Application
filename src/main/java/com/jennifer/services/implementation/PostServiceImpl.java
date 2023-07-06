package com.jennifer.services.implementation;

import com.jennifer.entity.Post;
import com.jennifer.repositories.PostRepository;
import com.jennifer.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;


    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        Post postUpdate =  postRepository.save(post);
        return postUpdate;
    }

  @Override
    public void deletePost(Long postId) {
      postRepository.deleteById(postId);

    }



    @Override
    public Post getPost(Long id) {
        return postRepository.findById(id).get();
    }


  }

