package com.pis.upms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.upms.dao.mapper.UpmsUserMapper;
import com.pis.upms.dao.model.UpmsUser;
import com.pis.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shupis on 2017/7/1.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {
    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }
}
