package com.pis.cms.rpc.service.impl;

import com.pis.common.annotation.BaseService;
import com.pis.common.base.BaseServiceImpl;
import com.pis.cms.dao.mapper.CmsPageMapper;
import com.pis.cms.dao.model.CmsPage;
import com.pis.cms.dao.model.CmsPageExample;
import com.pis.cms.rpc.api.CmsPageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsPageService实现
* Created on 2017/7/5.
*/
@Service
@Transactional
@BaseService
public class CmsPageServiceImpl extends BaseServiceImpl<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

    private static Logger _log = LoggerFactory.getLogger(CmsPageServiceImpl.class);

    @Autowired
    CmsPageMapper cmsPageMapper;

}