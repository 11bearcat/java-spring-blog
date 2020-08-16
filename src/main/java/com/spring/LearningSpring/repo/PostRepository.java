package com.spring.LearningSpring.repo;

import com.spring.LearningSpring.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {


}
