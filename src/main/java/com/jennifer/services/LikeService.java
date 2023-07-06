package com.jennifer.services;

import javax.servlet.http.HttpServletRequest;

public interface LikeService {
    void toggleLike(Long postId, HttpServletRequest request);
    void deleteLike(Long likeId);
}
