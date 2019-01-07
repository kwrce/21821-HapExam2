package com.hand.exam.bills.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.exam.bills.dto.Material;

import java.util.List;

public interface MaterialMapper extends Mapper<Material>{

    /**
     * Lov查询
     * @param condition
     * @return
     */
    List<Material> selectLovMaterial(Material condition);
}