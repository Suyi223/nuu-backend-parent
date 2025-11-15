package com.nuu.framework.config;

import com.nuu.framework.filter.GlobalRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 过滤器配置类
 *
 * @author Suyi
 **/
@Configuration
public class FilterConfig {

    @Bean
    FilterRegistrationBean<GlobalRequestFilter> globalRequestFilter() {
        FilterRegistrationBean<GlobalRequestFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new GlobalRequestFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

}
