package com.example.bloger.myBlog.repositories;

import com.example.bloger.myBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
