package com.cn.changgou.service.goods.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.changgou.common.pojo.Result;
import com.cn.changgou.common.pojo.StatusCode;

import lombok.extern.log4j.Log4j2;

/**
 * 统一异常处理类
 */
@ControllerAdvice //声明该类是一个增强类
@Log4j2
public class BaseExceptionHandler {

    @SuppressWarnings("rawtypes")
	@ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<?> error(Exception e){
        e.printStackTrace();
        log.error("系统异常：{}",e.getMessage());
        return new Result(false, StatusCode.ERROR,"当前系统繁忙,请您稍后重试");
    }
}
