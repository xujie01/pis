package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsTagMapper;
import com.pis.cms.dao.model.CmsTag;
import com.pis.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created on 2017/7/5.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
