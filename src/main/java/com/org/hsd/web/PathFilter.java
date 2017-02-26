package com.org.hsd.web;

/**
 * Created by Administrator on 2017/2/22.
 */
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PathFilter implements Filter {

    private String postfix;
    private String homePage;

    public void init(FilterConfig filterConfig) throws ServletException {
        postfix = filterConfig.getInitParameter("postfix");
        homePage = filterConfig.getInitParameter("homePage");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String path = req.getContextPath();
        String myserver = req.getServerName() + ":" + req.getServerPort() + path;
        req.setAttribute("ctx", path);
        req.setAttribute("myserver", myserver);
        req.setAttribute("postfix", postfix);
        String pathInfo = req.getRequestURI();
        if (pathInfo == null || pathInfo.equals(path) || pathInfo.equals(path + "/") || "".equals(pathInfo)) {
            resp.sendRedirect(path + homePage);
            return;
        }
        chain.doFilter(request, response);

    }


    public void destroy() {

    }
}
