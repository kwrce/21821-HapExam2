package com.hand.exam.bills.service;

import com.hand.exam.bills.dto.Bill;
import com.hand.exam.bills.dto.DocLine;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import java.util.List;

public interface IBillService extends IBaseService<Bill>, ProxySelf<IBillService> {
    List<Bill> selectByBill(IRequest requestContext, Bill bill, int page, int
            pagesize);

    List<Bill> batchUpdate(IRequest requestContext, @StdWho List<Bill>
            bills);
}
