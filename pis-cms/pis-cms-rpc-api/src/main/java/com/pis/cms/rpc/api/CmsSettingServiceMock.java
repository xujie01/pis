package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsSettingMapper;
import com.pis.cms.dao.model.CmsSetting;
import com.pis.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created on 2017/7/5.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
