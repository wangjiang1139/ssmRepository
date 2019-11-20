/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyExceptionResolver
 * Author:   wangjiang
 * Date:     2019/11/19 20:38
 * Description: 定义异常处理器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈定义异常处理器〉
 *
 * @author wangjiang
 * @create 2019/11/19
 * @since 1.0.0
 */
public class MyExceptionResolver implements HandlerExceptionResolver{


    private static final Logger logger = LoggerFactory.getLogger(MyExceptionResolver.class);

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {

        MyException myException = null;

        if(exception instanceof MyException){
            myException = (MyException) exception;
        }else {
            logger.error("system error!!!!!");
        }

        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
