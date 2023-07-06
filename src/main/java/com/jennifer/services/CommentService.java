package com.jennifer.services;

import com.jennifer.entity.Comment;
import com.jennifer.entity.FbUser;

public interface CommentService {

    Comment createComment(Long postId, String commentContent, FbUser user);
    Comment getCommentByPostId(Comment comment, FbUser fbUser);

    Comment deleteComment(Comment comment, FbUser fbUser);
}
