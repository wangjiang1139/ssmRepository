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

import com.alibaba.fastjson.JSON;
import com.cn.cmbc.batch.base.BaseHeander;
import com.cn.cmbc.interceptor.MyrInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

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
            HashMap<String, BaseHeander> headerMap = MyrInterceptor.getHeaderMap();
            BaseHeander header = headerMap.get("header");
            header.setMessage(myException.getMessage());
            header.setStatus("E");
            String json = JSON.toJSON(header).toString();
            logger.error(json);
            try {
                response.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            exception.printStackTrace();
            logger.error("system error!!!!!");
        }

        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
