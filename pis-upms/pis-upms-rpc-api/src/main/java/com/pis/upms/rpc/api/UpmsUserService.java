package com.pis.upms.rpc.api;

import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsUser;
import com.pis.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created on 2017/7/1.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {
    UpmsUser createUser(UpmsUser upmsUser);
}