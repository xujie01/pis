package com.pis.cms.rpc.service.impl;

import com.pis.common.annotation.BaseService;
import com.pis.common.base.BaseServiceImpl;
import com.pis.cms.dao.mapper.CmsArticleTagMapper;
import com.pis.cms.dao.model.CmsArticleTag;
import com.pis.cms.dao.model.CmsArticleTagExample;
import com.pis.cms.rpc.api.CmsArticleTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleTagService实现
* Created on 2017/7/5.
*/
@Service
@Transactional
@BaseService
public class CmsArticleTagServiceImpl extends BaseServiceImpl<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

    private static Logger _log = LoggerFactory.getLogger(CmsArticleTagServiceImpl.class);

    @Autowired
    CmsArticleTagMapper cmsArticleTagMapper;

}