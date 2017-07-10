package com.pis.cms.rpc.service.impl;

import com.pis.common.annotation.BaseService;
import com.pis.common.base.BaseServiceImpl;
import com.pis.cms.dao.mapper.CmsMenuMapper;
import com.pis.cms.dao.model.CmsMenu;
import com.pis.cms.dao.model.CmsMenuExample;
import com.pis.cms.rpc.api.CmsMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsMenuService实现
* Created on 2017/7/5.
*/
@Service
@Transactional
@BaseService
public class CmsMenuServiceImpl extends BaseServiceImpl<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

    private static Logger _log = LoggerFactory.getLogger(CmsMenuServiceImpl.class);

    @Autowired
    CmsMenuMapper cmsMenuMapper;

}