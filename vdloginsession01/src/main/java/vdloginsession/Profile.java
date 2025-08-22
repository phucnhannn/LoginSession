package vdloginsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Profile extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false); // false means do not create a new session if one does not exist
		if(session!=null){
			 String name=(String)session.getAttribute("name");
			 out.print("Chào bạn,"+name+"đến với trang quản lý tài khoản");
			 }
			 else {
			 out.print("Xin vui lòng đăng nhập");
			 resp.sendRedirect("/HelloServlet/Login.html");
			 }
		}
}
