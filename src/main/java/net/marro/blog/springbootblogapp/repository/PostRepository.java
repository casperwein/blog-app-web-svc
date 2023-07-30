package net.marro.blog.springbootblogapp.repository;

import net.marro.blog.springbootblogapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
