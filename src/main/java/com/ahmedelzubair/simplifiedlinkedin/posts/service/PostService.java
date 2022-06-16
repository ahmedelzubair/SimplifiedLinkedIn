package com.ahmedelzubair.simplifiedlinkedin.posts.service;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.dto.PostDTO;

import java.util.Optional;
import java.util.Set;

public interface PostService {
    PostDTO createPost(PostDTO post);

    Optional<PostDTO> findPostById(Long postId);

    PostDTO updatePost(PostDTO post);

    void deletePost(Long postId);

    Set<PostDTO> getUserPosts(Long userId);

    Set<PostDTO> getUserTimeline(Long userId);

}
