package qurban.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qurban.dao.CustomerDAO;
import qurban.model.Customer;

/**
 * Servlet implementation class AddShawlController
 */
@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public AddCustomerController() {
		super();
		dao = new CustomerDAO();
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Customer c = new Customer();
		c.setCustname(request.getParameter("custname"));
		c.setCustemail(request.getParameter("custemail"));
		c.setCustaddress(request.getParameter("custaddress"));
		c.setCustnumber(Integer.parseInt(request.getParameter("custnumber")));
		
		
		
		
		dao.addCustomer(c); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("customers", CustomerDAO.getAllCustomers());
		RequestDispatcher view = request.getRequestDispatcher("listCustomer.jsp");
		view.forward(request, response);
		
	}
	}
