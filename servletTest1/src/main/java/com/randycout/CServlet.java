package com.randycout;

import javax.servlet.*;
import javax.servlet.GenericServlet;
import java.io.IOException;
import java.util.Enumeration;

public class CServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        /*
        研究ServletConfig对象
        * 1.ServletConfig对象其实就是把<servlet></servlet><servlet-mapping></servlet-mapping>中的内容封装成ServletConfig对象
          2.通过ServletConfig对象可以获取当前servlet类中在web.xml中配置的所有信息.
           -
        * */
        ServletConfig servletConfig = this.getServletConfig();
        //1.获取所有的key,返回字符串枚举类型
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            //2.通过key获得对应的value
            String value = servletConfig.getInitParameter(name);
        }
        //3.获得ServletName
        String servletName = servletConfig.getServletName();
        //4.获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();
        String contextPath = servletContext.getContextPath();//得到项目路径 /servletTest1
        Enumeration<String> keys = servletContext.getInitParameterNames();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = servletContext.getInitParameter(key);
        }
        request.getServletContext();
        request.getAttribute("name");
        request.setAttribute("name","zhangsan");
        request.getAttributeNames();
        request.getParameter("name");
        request.getParameterMap();
        request.getParameterNames();
        request.getParameterValues("hobbit");
        request.getServerName();
        request.getCharacterEncoding();
        request.getRequestDispatcher("/a").forward(request,response);
        request.getServerPort();




    }
}
