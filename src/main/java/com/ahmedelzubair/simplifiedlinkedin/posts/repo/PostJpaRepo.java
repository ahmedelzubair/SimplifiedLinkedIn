package com.ahmedelzubair.simplifiedlinkedin.posts.repo;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface PostJpaRepo extends JpaRepository<Post, Long> {
    Optional<Set<Post>> findPostsByOwnerIdOrderByCreatedAtDesc(Long ownerId);

}
