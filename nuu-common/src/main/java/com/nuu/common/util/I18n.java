package com.nuu.common.util;

import cn.dev33.satoken.spring.SpringMVCUtil;
import cn.hutool.core.util.StrUtil;
import com.nuu.common.prop.EnvProperties;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 国际化工具类
 *
 * @author Suyi
 **/
@Component
public class I18n {

    private static MessageSource messageSource;

    public I18n(MessageSource messageSource) {
        I18n.messageSource = messageSource;
    }

    /**
     * 获取单个国际化翻译值（带参数替换）
     */
    public static String get(String msgKey, Object...objects) {
        try {
            return messageSource.getMessage(msgKey, objects, getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }

    /**
     *  获取单个国际化翻译值
     */
    public static String get(String key) {
        return get(key, "");
    }
    
    public static Locale getLocale() {
        // 通过request请求header中Accept-Language获取显示语言
        String acceptLanguage = SpringMVCUtil.getRequest().getHeader("Accept-Language");
        if (StrUtil.isNotEmpty(acceptLanguage)) {
            String[] locales = acceptLanguage.split(",");
            String[] langCountry = locales[0].split("-");
            if (langCountry.length == 2) {
                return Locale.of(langCountry[0], langCountry[1].toUpperCase());
            }
        }
        // 使用配置的默认语言
        String defaultLanguage = EnvProperties.getProperty("nuu.i18n.default");
        return Locale.of(defaultLanguage.split("-")[0], defaultLanguage.split("-")[1].toUpperCase());
    }

}
