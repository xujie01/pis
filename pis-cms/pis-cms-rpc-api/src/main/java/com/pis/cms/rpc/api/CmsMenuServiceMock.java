package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsMenuMapper;
import com.pis.cms.dao.model.CmsMenu;
import com.pis.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created on 2017/7/5.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
