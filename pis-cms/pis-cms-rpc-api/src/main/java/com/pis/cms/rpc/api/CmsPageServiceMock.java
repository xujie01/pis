package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsPageMapper;
import com.pis.cms.dao.model.CmsPage;
import com.pis.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created on 2017/7/5.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
