package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    PostMapper postMapper;

    public PostService(PostMapper postMapper) {   // 의존성 주입
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost(){     // 반환만 하는 역할
        return postMapper.findAll();
    }
}
