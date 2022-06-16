package com.ahmedelzubair.simplifiedlinkedin.posts.service;

import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.dto.PostDTO;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.mapper.PostMapper;
import com.ahmedelzubair.simplifiedlinkedin.posts.repo.PostJpaRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostJpaRepo postJpaRepo;
    private final PostMapper postMapper;

    public PostServiceImpl(PostJpaRepo postJpaRepo) {
        this.postJpaRepo = postJpaRepo;
        this.postMapper = PostMapper.INSTANCE;
    }


    @Override
    public PostDTO createPost(PostDTO post) {

        Post postEntity = postMapper.mapToEntity(post);

        postJpaRepo.save(postEntity);

        return postMapper.mapToDTO(postEntity);
    }

    @Override
    public Optional<PostDTO> findPostById(Long postId) {

        Optional<Post> postEntity = postJpaRepo.findById(postId);

        if (postEntity.isEmpty()) {
            throw new EntityNotFoundException("Post with id " + postId + " does not exist");
        }

        return Optional.of(postMapper.mapToDTO(postEntity.get()));
    }

    @Override
    public PostDTO updatePost(PostDTO post) {

        Post postEntity = postMapper.mapToEntity(post);

        Optional<Post> postOptional = postJpaRepo.findById(postEntity.getId());

        if (postOptional.isEmpty()) {
            throw new EntityNotFoundException("Post with id " + postEntity.getId()
                    + " does not exist");
        }

        Post updatedPost = postJpaRepo.save(postEntity);

        return postMapper.mapToDTO(updatedPost);
    }

    @Override
    public void deletePost(Long postId) {

        Optional<Post> postOptional = postJpaRepo.findById(postId);

        if (postOptional.isEmpty()) {
            throw new EntityNotFoundException("Post with id " + postId
                    + " does not exist");
        }

        postJpaRepo.delete(postOptional.get());
    }

    @Override
    public Set<PostDTO> getUserPosts(Long userId) {

        Optional<Set<Post>> postOptional = postJpaRepo.findPostsByOwnerIdOrderByCreatedAtDesc(userId);

        if (postOptional.isEmpty()) {
            throw new EntityNotFoundException("Post with user id " + userId
                    + " does not exist");
        }

        return postOptional.get().stream().map(postMapper::mapToDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<PostDTO> getUserTimeline(Long userId) {

        Optional<Set<Post>> postOptional = postJpaRepo.findPostsByOwnerIdOrderByCreatedAtDesc(userId);

        if (postOptional.isEmpty()) {
            throw new EntityNotFoundException("Post with user id " + userId
                    + " does not exist");
        }

        return postOptional.get().stream().map(postMapper::mapToDTO)
                .collect(Collectors.toSet());

    }
}
