package com.rtt.demo.mapper;

import com.rtt.demo.domain.CollectRecord;
import org.apache.ibatis.annotations.Mapper;


@Mapper

public interface CollectRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CollectRecord record);

    int insertSelective(CollectRecord record);

    CollectRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CollectRecord record);

    int updateByPrimaryKey(CollectRecord record);

    CollectRecord selectAll(Long id);
}