package servlet.api;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns={"/api/login"})
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("1234")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "admin");
            response.sendRedirect("/hello");
        }

        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("帳號或密碼錯誤");
    }
}
