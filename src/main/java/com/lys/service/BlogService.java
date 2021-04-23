package com.lys.service;

import com.lys.po.Blog;
import com.lys.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId, Pageable pageable);

    Page<Blog> listBlog(String query, Pageable pageable);

    Map<String,List<Blog>> archiveBlog();

    Blog getAndConvert(Long id);

    List<Blog> listRecommendBlogTop(Integer size);

    Long countBlog();

}
