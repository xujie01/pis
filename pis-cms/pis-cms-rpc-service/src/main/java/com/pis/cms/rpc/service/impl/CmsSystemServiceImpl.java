package com.pis.cms.rpc.service.impl;

import com.pis.common.annotation.BaseService;
import com.pis.common.base.BaseServiceImpl;
import com.pis.cms.dao.mapper.CmsSystemMapper;
import com.pis.cms.dao.model.CmsSystem;
import com.pis.cms.dao.model.CmsSystemExample;
import com.pis.cms.rpc.api.CmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsSystemService实现
* Created on 2017/7/5.
*/
@Service
@Transactional
@BaseService
public class CmsSystemServiceImpl extends BaseServiceImpl<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(CmsSystemServiceImpl.class);

    @Autowired
    CmsSystemMapper cmsSystemMapper;

}