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

    public List<Post> getPostByPage(Integer page, Integer size){
        return postMapper.findByPage(size,(page-1)*size);     // page가 0부터 들어와서
    }

    public Post getPostById(Integer id){
        return postMapper.findOne(id);
    }

    public boolean savePost(Post post){
        Integer result = postMapper.save(post);
        return result == 1;
    }
}
