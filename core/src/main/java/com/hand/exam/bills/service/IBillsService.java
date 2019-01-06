package com.hand.exam.bills.service;

import com.hand.exam.bills.controllers.BillsController;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

public interface IBillsService extends IBaseService<BillsController>, ProxySelf<IBillsService> {

}