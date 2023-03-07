package com.springboot.blog.repository;

import com.springboot.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // we do not need to add @Repository annotation or any code here as we are extending the JpaRepository, that extends the simpleJpaRepository that handles this
    // internally
}
