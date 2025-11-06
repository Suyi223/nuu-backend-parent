package com.nuu.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Http响应状态码
 *
 * @Author Suyi
 * @Date 2025/11/3
 **/
@AllArgsConstructor
@Getter
public enum HttpStatusEnum {

    // 请求成功
    SUCCESS(200, "请求成功"),

    // 请求成功，没有返回任何内容
    NO_CONTENT(204, "请求成功"),

    // 错误请求
    BAD_REQUEST(400, "错误请求"),

    // 未授权
    UNAUTHORIZED(401, "未授权"),

    // 无权限
    FORBIDDEN(403, "无权限"),

    // 请求未找到
    NOT_FOUND(404, "请求未找到"),

    // 不支持的请求方法
    METHOD_NOT_ALLOWED(405, "不支持的请求方法"),

    // 请求失败，请稍后重试
    LOCKED(423, "请求失败，请稍后重试"),

    // 请求过于频繁，请稍后重试
    TOO_MANY_REQUESTS(429, "请求过于频繁，请稍后重试"),

    // 系统异常
    INTERNAL_SERVER_ERROR(500, "系统异常"),

    // 功能未实现/未开启
    NOT_IMPLEMENTED(501, "功能未实现/未开启"),

    // 系统提示
    MESSAGE(900, "系统提示"),

    // 系统警告
    WARNING(901, "系统警告"),

    // 参数错误
    PARAM_ERROR(902, "参数错误"),

    // 参数缺失
    PARAM_LESS(903, "参数缺失"),

    // 参数包含特殊字符
    PARAM_INCLUDE_SPECIAL(904, "参数包含特殊字符"),

    // 签名错误
    SIGNATURE_ERROR(998, "签名错误"),

    // 系统错误
    UNKNOWN_ERROR(999, "未知错误"),
    ;

    private final int code;
    private final String message;

}
