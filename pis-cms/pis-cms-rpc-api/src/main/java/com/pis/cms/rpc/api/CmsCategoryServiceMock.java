package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsCategoryMapper;
import com.pis.cms.dao.model.CmsCategory;
import com.pis.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created on 2017/7/5.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
