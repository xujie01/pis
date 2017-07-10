package com.pis.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsUserPermission;
import com.pis.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created on 2017/7/1.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {
    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);
}