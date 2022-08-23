package randycout.servelt;

import javax.servlet.Servlet;

public class UserLoginServlet implements Servlet {//模拟web程序员编写Servlet代码
    @Override
    public void service() {
        System.out.println("UserLoginServlet执行............");
    }
}
