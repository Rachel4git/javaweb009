package main.atrachel;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by hd48552 on 2018/6/1.
 */
public class HelloFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("namespace")+"hello filter2's init");
    }

    @Override
    public void destroy() {
        System.out.println("hello filter2's destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello filter2's dofilter");
        System.out.println("before filter2's chain.dofilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("after filter2's chain.dofilter");
    }
}
