package com.blog.dao;

import com.blog.entity.Comment;


import java.util.List;
import java.util.Map;




public interface CommentDao {

    //添加
    int add(Comment paramComment);
    //更新该评论的状态
    int update(Comment paramComment);
    //展示
    List<Comment> list(Map<String, Object> paramMap);
    //获取某条博客下的评论数
    Long getTotal(Map<String, Object> paramMap);
    //删除
    Integer delete(Integer paramInteger);

    /**
     * 删除博客的时候，调用此方法按照博客id删除其下评论，
     * @param blogId
     * @return
     */
    Integer deleteByBlogId(Integer blogId);
}

