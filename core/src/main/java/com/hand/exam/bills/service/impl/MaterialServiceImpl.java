package com.hand.exam.bills.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.Material;
import com.hand.exam.bills.service.IMaterialService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MaterialServiceImpl extends BaseServiceImpl<Material> implements IMaterialService{

}