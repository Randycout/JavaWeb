package org.apach;

import javax.servlet.Servlet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Tomcat {//模拟webServer服务器厂商调用执行Servlet程序

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("请输入访问路径");
        Scanner in=new Scanner(System.in);
        String path=in.nextLine();
        Properties properties=new Properties();
        properties.load(new FileReader("D:\\Code\\workPlace\\idea\\JavaWeb\\demo\\src\\web.properties"));
        String value=properties.getProperty(path);
        System.out.println(value);
        Class clazz=Class.forName(value);
        Servlet servlet=(Servlet)clazz.newInstance();
        servlet.service();

    }
}
