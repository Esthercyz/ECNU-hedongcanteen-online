package com.cyz.properties;

import lombok.Data;
//引入了 Lombok 库中的 Data 注解。Lombok 是一个可以通过注解减少样板代码的工具，@Data 注解会为该类自动生成常见的方法，如 getter、setter、equals、hashCode、toString 等，避免了手动编写这些方法，使代码更加简洁。
import org.springframework.boot.context.properties.ConfigurationProperties;
//导入 Spring Boot 的 ConfigurationProperties 注解，该注解用于将外部配置文件（如 application.properties 或 application.yml）中的属性映射到该类的字段中。
import org.springframework.stereotype.Component;
//导入 Spring 的 Component 注解，将该类标记为 Spring 容器中的一个组件，使得 Spring 可以对其进行管理。

@Component
@ConfigurationProperties(prefix = "cyz.jwt")
@Data
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
