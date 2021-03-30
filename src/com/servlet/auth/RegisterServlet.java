package com.servlet.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;
import com.entity.User;
import com.utils.HibernateUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
       
    public RegisterServlet() {
        super();
        
        this.userDAO = new UserDAO();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		request.getRequestDispatcher("/views/auth/register.jsp")
			.forward(request, response);
	}


	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		User entity = new User();
		try {
			BeanUtils.populate(
				entity,
				request.getParameterMap()
			);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.userDAO.store(entity);

		doGet(request, response);
	}
	
	@Override
	public void init() throws ServletException
	{
		System.out.println("Init...");
		super.init();
	}
	
	@Override
	public void destroy()
	{
		System.out.println("Destroy...");
		super.destroy();
	}
	
	@Override
	protected void service(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		System.out.println("Processing...");
		super.service(request, response);
	}

}
