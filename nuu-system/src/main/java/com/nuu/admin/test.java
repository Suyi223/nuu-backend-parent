package com.nuu.admin;

import com.nuu.common.entity.Result;
import com.nuu.common.util.I18n;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Author Suyi
 * @Date 2025/11/2
 **/
@RestController
public class test {

    @RequestMapping("/test")
    public Result<?> test1(){
        System.out.println("tes111");
        return Result.message(I18n.get("http.status.unauthorized"));
    }

}
