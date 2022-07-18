package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.DependentDAO;
import qurban.model.Dependent;

/**
 * Servlet implementation class AddShawlController
 */
@WebServlet("/AddDependentController")
public class AddDependentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private DependentDAO dao;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public AddDependentController() {
		super();
		dao = new DependentDAO();
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Dependent d = new Dependent();
		d.setDependentname(request.getParameter("dependentname"));
		d.setTelephoneno(Integer.parseInt(request.getParameter("telephoneno")));
		
		dao.addDependent(d); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("dependents", DependentDAO.getAllDependents());
		RequestDispatcher view = request.getRequestDispatcher("listDependent.jsp");
		view.forward(request, response);
		
	}
	}