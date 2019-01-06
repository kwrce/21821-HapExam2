package com.hand.exam.bills.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.exam.bills.dto.Organization;
import com.hand.exam.bills.service.IOrganizationService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrganizationServiceImpl extends BaseServiceImpl<Organization> implements IOrganizationService{

}