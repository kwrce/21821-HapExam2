package com.hand.exam.bills.mapper;

import com.hand.exam.bills.dto.Doc;
import com.hand.hap.mybatis.common.Mapper;
import com.hand.exam.bills.dto.Item;

import java.util.List;

public interface ItemMapper extends Mapper<Item>{
    List<Item> selectLOV(Item item);

}