package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsArticleMapper;
import com.pis.cms.dao.model.CmsArticle;
import com.pis.cms.dao.model.CmsArticleExample;

/**
* 降级实现CmsArticleService接口
* Created on 2017/7/5.
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

}
