package com.pis.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsPermission;
import com.pis.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created on 2017/7/1.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {
    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);
}