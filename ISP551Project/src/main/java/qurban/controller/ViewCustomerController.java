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
 * Servlet implementation class ViewCustomerController
 */
@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerController() {
        super();
        dao = new CustomerDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int custid = Integer.parseInt(request.getParameter("cid"));
		String cid = request.getParameter("custid");
		request.setAttribute("c",CustomerDAO.getCustomerById(custid));
		RequestDispatcher view = request.getRequestDispatcher("viewCustomer.jsp");
		view.forward(request, response);
	}


}
