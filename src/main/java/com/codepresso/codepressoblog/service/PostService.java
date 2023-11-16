package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost(){
        return postMapper.findAll();
    }
}
