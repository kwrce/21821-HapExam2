package com.hand.exam.bills.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.Txns;
import com.hand.exam.bills.service.ITxnsService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TxnsServiceImpl extends BaseServiceImpl<Txns> implements ITxnsService{

}