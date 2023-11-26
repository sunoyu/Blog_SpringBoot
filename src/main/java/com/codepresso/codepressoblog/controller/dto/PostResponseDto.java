package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Getter;

@Getter
// 아래 있는 변수들을 사용해서 json데이터를 만들 때 Getter메서드를 사용한다.
public class PostResponseDto {
    Integer id;
    String title;
    String content;
    String username;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.username = post.getUsername();
    }

    public Post getPost(){
        return new Post(this.id, this.title, this.content, this.username);
    }
}
