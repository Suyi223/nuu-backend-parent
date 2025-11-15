package com.nuu.common.prop;

import lombok.NonNull;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 获取环境配置属性值
 *
 * @author Suyi
 **/
@Component
public class EnvProperties implements EnvironmentAware {

    private static Environment environment;

    @Override
    public void setEnvironment(@NonNull Environment env) {
        environment = env;
    }

    /**
     * 获取配置值（请确保spring容器启动完成之后使用）
     */
    public static String getProperty(String key) {
        return environment.getProperty(key);
    }
}
