package com.yuzi.mirror.service.impl;

import com.yuzi.mirror.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yuzi.mirror.dao.TbContentMapper;
import com.yuzi.mirror.service.TbContentService;

import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;


    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
