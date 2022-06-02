package com.ahmedelzubair.simplifiedlinkedin.posts.repo;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepo extends JpaRepository<Post, Long> {
}
