package com.codepresso.codepressoblog.vo;

import java.util.Date;

// 값을 담는, MyBatis 에서 쿼리를 담거나 서비스 컨트롤러 계층 두루두루 사용
public class Post {
    Integer id;
    String title;
    String content;
    String username;
    Date createAt;


    public Post(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }
    public Post(Integer id, String title, String content, String username, Date createAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createAt = createAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


}
