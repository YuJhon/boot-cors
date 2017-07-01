package com.jhon.rain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CORSFilter
 * @date 2017/7/1 19:42
 */
@Configuration
@WebFilter(urlPatterns = "/cors")
public class CORSFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Access-Control-Allow-Origin: 指定授权访问的域
        response.addHeader("Access-Control-Allow-Origin", "*");  //此优先级高于@CrossOrigin配置

        // Access-Control-Allow-Methods: 授权请求的方法（GET, POST, PUT, DELETE，OPTIONS等)
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");

        response.addHeader("Access-Control-Allow-Headers", "Content-Type");

        response.addHeader("Access-Control-Max-Age", "1800");//30 min
        filterChain.doFilter(request, response);
    }

}
