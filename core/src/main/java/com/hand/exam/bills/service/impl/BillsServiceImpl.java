package com.hand.exam.bills.service.impl;

import com.hand.exam.bills.controllers.BillsController;
import com.hand.exam.bills.service.IBillsService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class BillsServiceImpl extends BaseServiceImpl<BillsController> implements IBillsService {

}