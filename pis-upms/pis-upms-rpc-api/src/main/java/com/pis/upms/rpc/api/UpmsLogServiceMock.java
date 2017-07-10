package com.pis.upms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.upms.dao.mapper.UpmsLogMapper;
import com.pis.upms.dao.model.UpmsLog;
import com.pis.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shupis on 2017/7/1.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
