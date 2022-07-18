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
 * Servlet implementation class UpdateCustomerController
 */
@WebServlet("/UpdateCustomerController")
public class UpdateCustomerController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public UpdateCustomerController() {
		super();
		dao = new CustomerDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int custid = Integer.parseInt(request.getParameter("cid"));
		String cid = request.getParameter("custid");
		request.setAttribute("c", CustomerDAO.getCustomerById(custid));
		RequestDispatcher view = request.getRequestDispatcher("updateCustomer.jsp");
		view.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Customer c = new Customer();
		c.setCustid(Integer.parseInt(request.getParameter("custid")));
		c.setCustname(request.getParameter("custname"));
		c.setCustemail(request.getParameter("custemail"));
		c.setCustaddress(request.getParameter("custaddress"));
		c.setCustnumber(Integer.parseInt(request.getParameter("custnumber")));
		
		
		dao.updateCustomer(c); 
		
		request.setAttribute("customers",CustomerDAO.getAllCustomers());
		RequestDispatcher view = request.getRequestDispatcher("listCustomer.jsp");
		view.forward(request, response);
	}
}
