package com.hand.exam.bills.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.exam.bills.mapper.BillMapper;
import com.hand.exam.bills.service.IBillService;
import com.hand.exam.bills.service.IDocLineService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BillServiceImpl extends BaseServiceImpl<Bill> implements IBillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor =
            Exception.class)
    public List<Bill> selectByBill(IRequest requestContext, Bill bill, int
            page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return billMapper.selectByBill(bill);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Bill> batchUpdate(IRequest requestContext, List<Bill> bills){
        for (Bill bill : bills) {
            if (bill.get__status() != null) {
                switch (bill.get__status()) {
                    case DTOStatus.ADD:
                        billMapper.insertBill(bill);
                        break;
                    case DTOStatus.UPDATE:
                        billMapper.updateBill(bill);
                        break;
                    default:
                        break;
                }
            }
        }
        return bills;
    }
}