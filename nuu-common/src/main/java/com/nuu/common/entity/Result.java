package com.nuu.common.entity;

import com.nuu.common.enums.HttpStatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用HTTP响应结果类
 *
 * @Author Suyi
 * @Date 2025/11/5
 **/
@Data
public class Result<T> implements Serializable {

    // http状态码
    private int code;

    // 提示信息
    private String msg;

    // 响应数据
    private T data;

    // 请求成功，没有返回任何内容
    public Result(){
        this.code = HttpStatusEnum.NO_CONTENT.getCode();
        this.msg = HttpStatusEnum.NO_CONTENT.getMessage();
    }

    // 请求成功，并返回数据
    public Result(T data){
        this.code = HttpStatusEnum.SUCCESS.getCode();
        this.msg = HttpStatusEnum.SUCCESS.getMessage();
        this.data = data;
    }

    // 自定义返回状态码及提示信息
    public Result(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    // 请求成功，没有返回任何内容
    public static <T> Result<T> success(){
        return new Result<>();
    }

    // 请求成功，并返回数据
    public static <T> Result<T> success(T data){
        return new Result<>(data);
    }

    // 系统提示
    public static <T> Result<T> message(String msg){
        return new Result<>(HttpStatusEnum.MESSAGE.getCode(), msg);
    }

    // 系统警告
    public static <T> Result<T> warning(String msg){
        return new Result<>(HttpStatusEnum.WARNING.getCode(), msg);
    }

    // =============== 常用错误 ===============

    // 出现错误（未知错误）
    public static <T> Result<T> error(){
        return new Result<>(HttpStatusEnum.UNKNOWN_ERROR.getCode(), HttpStatusEnum.UNKNOWN_ERROR.getMessage());
    }

    // 参数错误
    public static <T> Result<T> paramError(){
        return new Result<>(HttpStatusEnum.PARAM_ERROR.getCode(), HttpStatusEnum.PARAM_ERROR.getMessage());
    }

    // 参数缺失
    public static <T> Result<T> paramLess(){
        return new Result<>(HttpStatusEnum.PARAM_LESS.getCode(), HttpStatusEnum.PARAM_LESS.getMessage());
    }

    // 参数包含特殊字符
    public static <T> Result<T> paramIncludeSpecial(){
        return new Result<>(HttpStatusEnum.PARAM_INCLUDE_SPECIAL.getCode(), HttpStatusEnum.PARAM_INCLUDE_SPECIAL.getMessage());
    }

    // =============== 其他不常用错误 ===============

    // 错误请求
    public static <T> Result<T> badRequest(){
        return new Result<>(HttpStatusEnum.BAD_REQUEST.getCode(), HttpStatusEnum.BAD_REQUEST.getMessage());
    }

    // 未授权
    public static <T> Result<T> unauthorized(){
        return new Result<>(HttpStatusEnum.UNAUTHORIZED.getCode(), HttpStatusEnum.UNAUTHORIZED.getMessage());
    }

    // 无权限
    public static <T> Result<T> forbidden(){
        return new Result<>(HttpStatusEnum.FORBIDDEN.getCode(), HttpStatusEnum.FORBIDDEN.getMessage());
    }

    // 请求未找到
    public static <T> Result<T> notFound(){
        return new Result<>(HttpStatusEnum.NOT_FOUND.getCode(), HttpStatusEnum.NOT_FOUND.getMessage());
    }

    // 不支持的请求方法
    public static <T> Result<T> methodNotAllowed(){
        return new Result<>(HttpStatusEnum.METHOD_NOT_ALLOWED.getCode(), HttpStatusEnum.METHOD_NOT_ALLOWED.getMessage());
    }

    // 请求失败，请稍后重试
    public static <T> Result<T> locked(){
        return new Result<>(HttpStatusEnum.LOCKED.getCode(), HttpStatusEnum.LOCKED.getMessage());
    }

    // 请求过于频繁，请稍后重试
    public static <T> Result<T> tooManyRequests(){
        return new Result<>(HttpStatusEnum.TOO_MANY_REQUESTS.getCode(), HttpStatusEnum.TOO_MANY_REQUESTS.getMessage());
    }

    // 系统异常
    public static <T> Result<T> internalServerError(){
        return new Result<>(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode(), HttpStatusEnum.INTERNAL_SERVER_ERROR.getMessage());
    }

    // 功能未实现/未开启
    public static <T> Result<T> notImplemented(){
        return new Result<>(HttpStatusEnum.NOT_IMPLEMENTED.getCode(), HttpStatusEnum.NOT_IMPLEMENTED.getMessage());
    }

    // 签名错误
    public static <T> Result<T> signatureError(){
        return new Result<>(HttpStatusEnum.SIGNATURE_ERROR.getCode(), HttpStatusEnum.SIGNATURE_ERROR.getMessage());
    }

}
