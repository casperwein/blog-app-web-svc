package net.marro.blog.springbootblogapp.service;

import net.marro.blog.springbootblogapp.entity.Post;
import net.marro.blog.springbootblogapp.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(long id);

    PostDto updatePost (PostDto postDto, long id);

    void deletePostById(long id);
}
