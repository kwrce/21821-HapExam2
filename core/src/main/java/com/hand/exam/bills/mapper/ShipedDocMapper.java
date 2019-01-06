package com.hand.exam.bills.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.exam.bills.dto.ShipedDoc;

import java.util.List;

public interface ShipedDocMapper extends Mapper<ShipedDoc>{

    /**
     * Lov查询
     * @param condition
     * @return
     */
    List<ShipedDoc> selectLovShipedDoc(ShipedDoc condition);

}