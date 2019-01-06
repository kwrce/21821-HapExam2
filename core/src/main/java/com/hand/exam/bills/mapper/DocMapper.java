package com.hand.exam.bills.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.exam.bills.dto.Doc;

import java.util.List;

public interface DocMapper extends Mapper<Doc>{
    List<Doc> selectLOV(Doc customer);
}