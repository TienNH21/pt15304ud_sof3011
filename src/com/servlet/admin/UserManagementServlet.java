package com.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;
import com.entity.User;

@WebServlet("/admin/users")
public class UserManagementServlet extends HttpServlet
{
	private UserDAO userDAO;
	public UserManagementServlet()
	{
		this.userDAO = new UserDAO();
	}

	@Override
	public void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		List<User> listUser = this.userDAO.paginate(10, 1);
		
		request.setAttribute("listUser", listUser);
		request.getRequestDispatcher("/views/admin/users/index.jsp")
			.forward(request, response);
	}
}
