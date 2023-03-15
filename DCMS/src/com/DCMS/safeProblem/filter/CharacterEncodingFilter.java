package com.DCMS.safeProblem.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
@WebFilter("/safeHandle/*")
public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
