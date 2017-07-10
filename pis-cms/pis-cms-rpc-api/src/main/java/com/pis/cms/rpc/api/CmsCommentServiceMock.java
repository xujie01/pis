package com.pis.cms.rpc.api;

import com.pis.common.base.BaseServiceMock;
import com.pis.cms.dao.mapper.CmsCommentMapper;
import com.pis.cms.dao.model.CmsComment;
import com.pis.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created on 2017/7/5.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
