package com.wgb.hrm.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.List;
import java.util.ArrayList;
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {


    public List<SwaggerResource> get() {
        List resources = new ArrayList();
        //通过网关访问服务地址
        resources.add(swaggerResource("系统管理", "/services/sysmanage/v2/api-docs", "2.0"));
        resources.add(swaggerResource("系统管理1", "/services/sysmanage/v2/api-docs", "2.0"));
        resources.add(swaggerResource("系统管理2", "/services/sysmanage/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}

