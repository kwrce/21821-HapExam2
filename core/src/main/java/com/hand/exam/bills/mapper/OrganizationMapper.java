package com.hand.exam.bills.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.exam.bills.dto.Organization;

import java.util.List;
import java.util.Map;

public interface OrganizationMapper extends Mapper<Organization>{
    List<Map<String,Object>> selectOrganizationInfo(Map<String,Object> map);

    List<Map<String,Object>> selectToOrganizationInfo(Map<String,Object> map);
}