package com.pis.upms.rpc.service.impl;

import com.pis.common.annotation.BaseService;
import com.pis.common.base.BaseServiceImpl;
import com.pis.upms.dao.mapper.UpmsOrganizationMapper;
import com.pis.upms.dao.model.UpmsOrganization;
import com.pis.upms.dao.model.UpmsOrganizationExample;
import com.pis.upms.rpc.api.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* Created on 2017/7/1.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}