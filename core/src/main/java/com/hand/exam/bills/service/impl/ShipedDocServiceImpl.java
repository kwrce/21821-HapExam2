package com.hand.exam.bills.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.ShipedDoc;
import com.hand.exam.bills.service.IShipedDocService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ShipedDocServiceImpl extends BaseServiceImpl<ShipedDoc> implements IShipedDocService{

}