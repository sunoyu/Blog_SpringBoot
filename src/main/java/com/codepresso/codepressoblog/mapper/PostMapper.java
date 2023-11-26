package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.Max;
import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();    /// 모든 데이터를 조회하는 함수. -> findAll이 호출될 때 post-mapper 바인딩
    List<Post> findByPage(@Param("limit") Integer limit, @Param("offset") Integer offset);

    Post findOne(@Param("id") Integer id);

    Integer save(@Param("post") Post post);  // 저장을 하면 1을 반환
}
