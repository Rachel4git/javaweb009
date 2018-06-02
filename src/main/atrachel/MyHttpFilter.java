package main.atrachel;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * Created by hd48552 on 2018/6/1.
 */
public class MyHttpFilter implements javax.servlet.Filter{
    private  FilterConfig filterConfig;
    public  FilterConfig getFilterConfig(){
        return  filterConfig;
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig=filterConfig;
        init();
    }

    public void init(){}
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        doFilter(httpServletRequest,httpServletResponse,filterChain);

    }

    public void doFilter(HttpServletRequest request, HttpServletResponse response,FilterChain filterChain){

    }
}
