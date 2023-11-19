package com.codepresso.codepressoblog.controller;


import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    // Post 서비스를 호출할 필요가있다. 블로그 글들을 가져와야해서.
    private PostService postService;

    public IndexController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> postList = postService.getAllPost();
        model.addAttribute("posts", postList);  // 키: 포스트, 값: 포스트리스트
        return "index";  // model을 index로 리턴 -> index.mustache로 보낸다.
    }
}
