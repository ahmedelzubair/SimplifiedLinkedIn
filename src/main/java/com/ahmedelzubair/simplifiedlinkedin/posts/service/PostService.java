package com.ahmedelzubair.simplifiedlinkedin.posts.service;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;

import java.util.Set;

public interface PostService {
    Post createPost(Post post);

    Post getPost(String postId);

    Post updatePost(Post post);

    void deletePost(String postId);

    Set<Post> getUserPosts(String userId);

    Set<Post> getUserTimeline(String userId);

}
