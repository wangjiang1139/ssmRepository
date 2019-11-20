/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyrInterceptor
 * Author:   wangjiang
 * Date:     2019/11/19 20:31
 * Description: 拦截器定义
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.cmbc.interceptor;

import com.cn.cmbc.common.RequestWrapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈拦截器定义〉
 *
 * @author wangjiang
 * @create 2019/11/19
 * @since 1.0.0
 */
public class MyrInterceptor implements HandlerInterceptor{
    //拦截之前做的事
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        RequestWrapper myRequestWrapper = new RequestWrapper(request);
        String body = myRequestWrapper.getBody();
        System.out.println(body);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("拦截方法执行之后执行了。。。。。。。。。。。。。。");
    }
}
