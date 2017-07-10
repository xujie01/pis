package com.pis.upms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.upms.dao.mapper.UpmsOrganizationMapper;
import com.pis.upms.dao.model.UpmsOrganization;
import com.pis.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by shupis on 2017/7/1.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
