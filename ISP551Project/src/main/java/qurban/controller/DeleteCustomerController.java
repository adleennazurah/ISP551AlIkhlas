package qurban.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.CustomerDAO;

@WebServlet("/DeleteCustomerController")
public class DeleteCustomerController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;
	
	public DeleteCustomerController() {
		super();
		dao = new CustomerDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int custid = Integer.parseInt(request.getParameter("cid"));
		String cid = request.getParameter("custid");
		dao.deleteCustomer(custid);
		request.setAttribute("customers", CustomerDAO.getAllCustomers());
		RequestDispatcher view = request.getRequestDispatcher("listCustomer.jsp");
		view.forward(request, response);
	}
}