package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("httpServletRequest = " + httpServletRequest);
        System.out.println("httpServletResponse = " + httpServletResponse);

        // 쿼리 파라미터 /hello?username=kim 를 쉽게 가져올 수 있음
        String username = httpServletRequest.getParameter("username");
        System.out.println("username = " + username);

        httpServletResponse.setContentType("text/plain");
        httpServletResponse.setCharacterEncoding("utf-8"); // euckr을 쓰면 안되고 무조건 utf-8 써야 함.
        httpServletResponse.getWriter().write("hello"+username);

    }
}
