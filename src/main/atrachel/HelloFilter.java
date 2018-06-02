package main.atrachel;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by hd48552 on 2018/6/1.
 */
//filter由web容器调用和执行
public class HelloFilter implements Filter {

//    创建filter类实例对象，实现filter接口
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
// 对filter进行初始化，只会被调用一次
// filter实例对象是单例的
//filterconfig与servletconfig类似，可以通过filterconfig对象获取到filter的初始化参数
        System.out.println(filterConfig.getInitParameter("namespace")+"'s hello filter's init");
    }

    @Override
    public void destroy() {
//        web容器卸载filter前调用，用于释放filter占用的资源，只会被调用一次
        System.out.println("hello filter's destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        filter的逻辑代码都在该方法中，每次拦截都会被调用
//        多个filter的调用顺序与在web.xml文件中配置的顺序有关，先配置的会先被调用
        System.out.println("hello filter's dofilter");
        System.out.println("before filter's chain.dofilter");
//        通过filterchain的dofilter方法，可以将请求传递给filter链的下一个filter，若当前filter已是filter链中的最后一个filter，则会将请求传递给目标JSP或servlet
//        filterChain.doFilter(servletRequest,servletResponse);
//        System.out.println("after filter's chain.dofilter");
        servletRequest.getRequestDispatcher("/HelloFilterTest2.jsp").forward(servletRequest,servletResponse);

    }
}
