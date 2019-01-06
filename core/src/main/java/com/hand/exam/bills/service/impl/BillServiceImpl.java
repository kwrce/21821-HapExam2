package com.hand.exam.bills.service.impl;

import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.exam.bills.service.IBillService;
import com.hand.exam.bills.service.IDocLineService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BillServiceImpl extends BaseServiceImpl<Bill> implements IBillService {

    @Override
    public List<Bill> selectByBill(IRequest requestContext, Bill bill, int page, int pagesize) {
        return null;
    }
}