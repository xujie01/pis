package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsSystemMapper;
import com.pis.cms.dao.model.CmsSystem;
import com.pis.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created on 2017/7/5.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
