package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;

import javax.validation.constraints.Max;
import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();    /// 모든 데이터를 조회하는 함수. -> findAll이 호출될 때 post-mapper 바인딩
}
