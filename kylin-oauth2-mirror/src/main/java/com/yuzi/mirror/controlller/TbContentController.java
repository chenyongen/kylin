package com.yuzi.mirror.controlller;

import com.yuzi.mirror.domain.TbContent;
import com.yuzi.mirror.dto.ResponseResult;
import com.yuzi.mirror.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/ok")
   public ResponseResult<List<TbContent>> getAllContent(){

       return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),tbContentService.selectAll());
   }
}
