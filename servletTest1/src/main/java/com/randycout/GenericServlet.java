package com.randycout;

import javax.servlet.*;
import java.io.IOException;

public abstract class GenericServlet implements Servlet {
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {//不建议重写
        this.servletConfig=servletConfig;//局部变量提升为全局变量
        System.out.println("GenericServlet init execute!!");
        this.init();
    }
    public void init(){//这个init是提供给子类重写的,防止重写init(ServletConfig servletConfig)导致拿不到servletConfig对象

    };
    @Override
    public ServletConfig getServletConfig() {//私有的属性通过对外提供公共的方法暴露给其他类调用
        return this.servletConfig;
    }

    @Override
    public abstract void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException;//设置成抽象类,让子类必须重写

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
