package vdloginsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	 @Override
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, 
	IOException {
	 resp.setContentType("text/html");

	 String username = req.getParameter("username");
	 String password = req.getParameter("password");
	 
	 PrintWriter out = resp.getWriter();
	 
	 if (username.equals("trungnh") && password.equals("123")) {
		 out.print("Chào mừng bạn, " + username);
		 HttpSession session = req.getSession();
		 session.setAttribute("name", username);
		 } else {
		 out.print("Tài khoản hoặc mật khẩu không chính xác");
		 req.getRequestDispatcher("Login.html").include(req, 
		resp);
		 }

	}
}
