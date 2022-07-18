package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.DependentDAO;

@WebServlet("/DeleteDependentController")
public class DeleteDependentController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private DependentDAO dao;
	
	public DeleteDependentController() {
		super();
		dao = new DependentDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		int dependentid = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("dependentid");
		dao.deleteDependent(dependentid);
		request.setAttribute("dependents", DependentDAO.getAllDependents());
		RequestDispatcher view = request.getRequestDispatcher("listDependent.jsp");
		view.forward(request, response);
	}
}