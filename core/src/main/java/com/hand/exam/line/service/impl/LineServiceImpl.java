package com.hand.exam.line.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.Line;
import com.hand.exam.line.service.ILineService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class LineServiceImpl extends BaseServiceImpl<Line> implements ILineService{

}