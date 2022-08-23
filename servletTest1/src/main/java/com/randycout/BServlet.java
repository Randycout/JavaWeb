package com.randycout;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class BServlet extends GenericServlet{//只需要重写service方法,其他方法可以选择性调用,代码优雅
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("BServlet's service execute!!");
        System.out.println(this.getServletConfig());

    }

    @Override
    public void init() {
        System.out.println("BServlet override init execute!!");
    }
}
