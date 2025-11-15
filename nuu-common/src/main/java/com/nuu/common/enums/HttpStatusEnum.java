package com.nuu.common.enums;

import com.nuu.common.util.I18n;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Http响应状态码
 *
 * @author Suyi
 **/
@AllArgsConstructor
public enum HttpStatusEnum {

    // 请求成功
    SUCCESS(200, "http.status.success"),

    // 请求成功，没有返回任何内容
    NO_CONTENT(204, "http.status.noContent"),

    // 错误请求
    BAD_REQUEST(400, "http.status.badRequest"),

    // 未授权
    UNAUTHORIZED(401, "http.status.unauthorized"),

    // 无权限
    FORBIDDEN(403, "http.status.forbidden"),

    // 请求未找到
    NOT_FOUND(404, "http.status.notFound"),

    // 不支持的请求方法
    METHOD_NOT_ALLOWED(405, "http.status.methodNotAllowed"),

    // 请求失败，请稍后重试
    LOCKED(423, "http.status.locked"),

    // 请求过于频繁，请稍后重试
    TOO_MANY_REQUESTS(429, "http.status.tooManyRequests"),

    // 系统异常
    INTERNAL_SERVER_ERROR(500, "http.status.internalServerError"),

    // 功能未实现/未开启
    NOT_IMPLEMENTED(501, "http.status.notImplemented"),

    // 系统提示
    MESSAGE(900, "http.status.message"),

    // 系统警告
    WARNING(901, "http.status.warning"),

    // 参数错误
    PARAM_ERROR(902, "http.status.paramError"),

    // 参数缺失
    PARAM_LESS(903, "http.status.paramLess"),

    // 参数包含特殊字符
    PARAM_INCLUDE_SPECIAL(904, "http.status.paramIncludeSpecial"),

    // 签名错误
    SIGNATURE_ERROR(998, "http.status.signatureError"),

    // 系统错误
    UNKNOWN_ERROR(999, "http.status.unknownError"),
    ;

    @Getter
    private final int code;

    private final String message;

    public String getMessage() {
        return I18n.get(this.message);
    }

}
