package com.pis.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压PisAdmin-x.x.x.jar到resources目录
 * Created on 2016/12/18.
 */
public class PisAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(PisAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("===== 开始解压pis-admin =====");
        String version = PropertiesFileUtil.getInstance("pis-admin-client").get("pis.admin.version");
        _log.info("pis-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/pis-admin-" + version + ".jar");
        _log.info("pis-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/pis-admin";
        _log.info("pis-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== 解压pis-admin完成 =====");
    }

}
