package com.nuu.framework.handler;

import cn.dev33.satoken.exception.NotLoginException;
import com.nuu.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author Suyi
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     *  未授权，账号未登录
     */
    @ExceptionHandler(value = NotLoginException.class)
    public Result<?> unauthorized() {
        return Result.unauthorized();
    }

    /**
     * 处理所有未显式捕获的异常，作为最终兜底方案
     */
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e) {
        log.error("found system error：", e);
        return Result.error();
    }

}
