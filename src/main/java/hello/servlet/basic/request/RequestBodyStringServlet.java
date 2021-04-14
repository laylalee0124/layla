package hello.servlet.basic.request;

import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Display on console
        ServletInputStream inputStream = request.getInputStream(); // bite code로 읽어올 수 있음.
        String messageBody
                = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
                // bite를 string으로 변환. bite를 문자로 변환할때는 encoding type을 명시해줘야함.

        System.out.println("messageBody = " + messageBody);

        // Display on browser
        response.getWriter().write("ok");


    }
}
