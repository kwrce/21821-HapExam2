package com.hand.exam.bills.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.DocLine;
import com.hand.exam.bills.service.IDocLineService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DocLineServiceImpl extends BaseServiceImpl<DocLine> implements IDocLineService{

}