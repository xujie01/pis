package com.pis.upms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.upms.dao.mapper.UpmsSystemMapper;
import com.pis.upms.dao.model.UpmsSystem;
import com.pis.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by shupis on 2017/7/1.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
