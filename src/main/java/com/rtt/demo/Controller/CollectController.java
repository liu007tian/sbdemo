package com.rtt.demo.Controller;

import com.rtt.demo.domain.CollectRecord;
import com.rtt.demo.mapper.CollectRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("collect")
public class CollectController {
    @Autowired
    private CollectRecordMapper CRM;
    @RequestMapping("/find/{id}")
    @ResponseBody
    public CollectRecord find(@PathVariable Long id){
        return CRM.selectByPrimaryKey(id);
    }
    @RequestMapping("/finds/{id}")
    @ResponseBody
    public CollectRecord finds(@PathVariable Long id){
        return CRM.selectAll(id);
    }
}
