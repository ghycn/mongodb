package com.org.hsd.web;

/**
 * Created by Administrator on 2017/2/22.
 */
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PathFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String path = req.getContextPath();
        String myserver = req.getServerName() + ":" + req.getServerPort() + path;
        req.setAttribute("ctx", path);
//        req.setAttribute("myserver", myserver);
        String pathInfo = req.getRequestURI();
        if (pathInfo == null || pathInfo.equals(path) || pathInfo.equals(path + "/") || "".equals(pathInfo)) {
            resp.sendRedirect(path + "/index.do");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
