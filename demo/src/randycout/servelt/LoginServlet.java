package randycout.servelt;

import javax.servlet.Servlet;

public class LoginServlet implements Servlet {
    @Override
    public void service() {
        System.out.println("LoginServlet执行了.........");
    }
}
