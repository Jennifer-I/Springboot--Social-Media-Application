package com.jennifer.services;

import com.jennifer.entity.Post;

public interface PostService {
 Post createPost(Post post);
 Post updatePost(Post post);
 void deletePost(Long postId);

 Post getPost(Long id);
}
