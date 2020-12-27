package com.storage.simpleBlog.repo;

import com.storage.simpleBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
