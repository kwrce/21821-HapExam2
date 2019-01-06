package com.hand.exam.doc.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.Doc;
import com.hand.exam.doc.service.IDocService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DocServiceImpl extends BaseServiceImpl<Doc> implements IDocService{

}