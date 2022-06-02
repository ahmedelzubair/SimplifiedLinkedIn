package com.ahmedelzubair.simplifiedlinkedin.posts.service;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;

import java.util.Set;

public interface PostService {
    void createPost(Post post);

    Post getPost(Long postId);

    Post updatePost(Post post);

    void deletePost(Long postId);

    Set<Post> getUserPosts(Long userId);

    Set<Post> getUserTimeline(Long userId);

}
