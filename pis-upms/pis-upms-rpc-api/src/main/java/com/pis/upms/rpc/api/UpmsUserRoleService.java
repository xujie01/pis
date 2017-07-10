package com.pis.upms.rpc.api;

import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsUserRole;
import com.pis.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created on 2017/7/1.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);
}