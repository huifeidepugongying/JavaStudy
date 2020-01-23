package ServletDay01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post请求");
        System.out.println("getMethod=" + request.getMethod());
        System.out.println("getContextPath=" + request.getContextPath());
        System.out.println("getServletPath=" + request.getServletPath());
        System.out.println("getRequestURI=" + request.getRequestURI());
        System.out.println("getRequestURL=" + String.valueOf(request.getRequestURL()));
        System.out.println("getRemoteAddr=" + request.getRemoteAddr());
        System.out.println("getProtocol=" + request.getProtocol());
        System.out.println("getQueryString=" + request.getQueryString());
        System.out.println("user-agent" + request.getHeader("user-agent"));
        Map<String, String[]> params = request.getParameterMap();
        for (String s : params.keySet()) {
            System.out.println(s + "=" + String.join(",", params.get(s)));
        }
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("哈哈");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get请求");
        System.out.println("getMethod=" + request.getMethod());
        System.out.println("getContextPath=" + request.getContextPath());
        System.out.println("getServletPath=" + request.getServletPath());
        System.out.println("getRequestURI=" + request.getRequestURI());
        System.out.println("getRequestURL=" + String.valueOf(request.getRequestURL()));
        System.out.println("getRemoteAddr=" + request.getRemoteAddr());
        System.out.println("getProtocol=" + request.getProtocol());
        System.out.println("getQueryString=" + request.getQueryString());
        System.out.println("user-agent=" + request.getHeader("user-agent"));
        Map<String, String[]> params = request.getParameterMap();
        for (String s : params.keySet()) {
            System.out.println(s + "=" + String.join(",", params.get(s)));
        }
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("哈哈");
    }
}
