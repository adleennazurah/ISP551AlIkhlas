package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.CustomerDAO;
/**
 * Servlet implementation class ListShawlController
 */
@WebServlet("/ListCustomerController")
public class ListCustomerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ListCustomerController() {
		super();
		dao = new CustomerDAO();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		request.setAttribute("customers", CustomerDAO.getAllCustomers());
		RequestDispatcher view = request.getRequestDispatcher("listCustomer.jsp");
		view.forward(request,response);
}
}