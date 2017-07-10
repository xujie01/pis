package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsTopicMapper;
import com.pis.cms.dao.model.CmsTopic;
import com.pis.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created on 2017/7/5.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
