package com.pis.upms.rpc.api;

import com.pis.common.base.BaseService;
import com.pis.upms.dao.model.UpmsUserOrganization;
import com.pis.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created on 2017/7/1.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {
    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);
}