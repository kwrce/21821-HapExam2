package com.hand.exam.bills.mapper;

import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

public interface BillMapper extends Mapper<Bill>{
    List<Bill> selectByBill(Bill bill);
    int insertBill(Bill bill);
    int updateBill(Bill bill);
    int deleteBill(Bill bill);
}