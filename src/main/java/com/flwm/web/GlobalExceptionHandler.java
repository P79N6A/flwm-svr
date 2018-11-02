package com.flwm.web;

import com.flwm.common.domain.ErrorCodeEnum;
import com.flwm.common.domain.FMException;
import com.flwm.common.domain.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by zhoupj on 10/25/18.
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Throwable.class)
    @ResponseBody
    public Result jsonErrorHandler(HttpServletRequest req, Throwable e) throws Exception {

        log.error("controller exp",e);

        if (e instanceof HttpRequestMethodNotSupportedException){
            return Result.fail(ErrorCodeEnum.REQUEST_EXCEPTION);
        }

        if (e instanceof MissingServletRequestParameterException){
            return Result.fail(ErrorCodeEnum.PARAM_EXCEPTION);
        }

        if(e instanceof FMException){
            FMException fm=(FMException) e;
            return Result.fail(fm.getErr());
        }


        return Result.fail(ErrorCodeEnum.SYS_EXCEPTION);
    }
}