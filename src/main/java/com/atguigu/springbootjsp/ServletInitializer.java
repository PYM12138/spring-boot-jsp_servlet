package com.atguigu.springbootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    //如果创建war包，这个类必须要有而且要继承SpringBootServletInitializer
    //详看笔记servlet那一章，解释了为什么这个是必须的。以及它的启动机制，和springboot如何配合在一起。

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootJspApplication.class);
    }

}
