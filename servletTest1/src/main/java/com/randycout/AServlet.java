package com.randycout;

import javax.servlet.*;
import java.io.IOException;

/*
* Servlet生命周期:
*      init():Servlet默认首次请求执行的时候创建对象,对象创建完后就调用init方法(只会执行一次)(完成初始化操作)
*      service(): 接着执行service方法,每一次请求都会调用一次service方法,这是servlet核心方法
*      destroy():tomcat服务器关闭之前需要销毁Servlet,Servlet对象销毁之前会调用destroy方法(只执行一次完成资源关闭)
*
* */
public class AServlet implements Servlet {
//   public AServlet(){
//        System.out.println("AServlet的无参构造方法执行");
//    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {//init方法带有的参数servletConfig是tomcat创建好,携带进去的
        System.out.println("AServlet init execute,servletConfig:"+servletConfig);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("AServlet service execute!");

        servletResponse.getWriter().println("这个乱码吗");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("AServlet destroy() execute");
    }
}
