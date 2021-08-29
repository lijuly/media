package com.media.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MediaHandlerInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler)
            throws Exception {
        System.out.println("preHandle 拦截器拦截了");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器 1：postHandle 方法执行了");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse
            response, Object handler, Exception ex)
            throws Exception {
        System.out.println("拦截器 1：afterCompletion 方法执行了");
    }

}
