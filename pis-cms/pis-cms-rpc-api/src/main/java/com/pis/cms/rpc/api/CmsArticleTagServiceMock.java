package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsArticleTagMapper;
import com.pis.cms.dao.model.CmsArticleTag;
import com.pis.cms.dao.model.CmsArticleTagExample;

/**
* 降级实现CmsArticleTagService接口
* Created on 2017/7/5.
*/
public class CmsArticleTagServiceMock extends BaseServiceMock<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

}
