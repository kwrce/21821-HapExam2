package com.hand.exam.bills.mapper;

import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

public interface BillMapper extends Mapper<Bill>{
    List<Bill> selectByBill(Bill bill);

    int insertBillDoc(Bill bill);
    int insertBillLine(Bill bill);

    int updateBillDoc(Bill bill);
    int updateBillLine(Bill bill);

    int deleteBillDoc(Bill bill);
    int deleteBillLine(Bill bill);
}