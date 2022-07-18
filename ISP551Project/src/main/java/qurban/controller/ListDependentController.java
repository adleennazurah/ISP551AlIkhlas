package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.DependentDAO;
/**
 * Servlet implementation class ListShawlController
 */
@WebServlet("/ListDependentController")
public class ListDependentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private DependentDAO dao;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ListDependentController() {
		super();
		dao = new DependentDAO();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("dependents", DependentDAO.getAllDependents());
		RequestDispatcher view = request.getRequestDispatcher("listDependent.jsp");
		view.forward(request,response);
}
}