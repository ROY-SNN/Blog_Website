package com.lys.service;


import com.lys.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listType(Pageable pageable);

    Tag updateType(Long id, Tag tag);

    Tag getTypeByName(String name);

    void delete(Long id);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);
}
