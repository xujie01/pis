package com.pis.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsRolePermission;
import com.pis.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created on 2017/7/1.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);
}