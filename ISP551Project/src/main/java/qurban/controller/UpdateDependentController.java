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

@WebServlet("/UpdateDependentController")
public class UpdateDependentController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private DependentDAO dao;
	
	public UpdateDependentController() {
		super();
		dao = new DependentDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//int dependentid = Integer.parseInt(request.getParameter("dependentid"));
		int dependentid = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("dependentid");
		request.setAttribute("d", DependentDAO.getDependentById(dependentid));
		RequestDispatcher view = request.getRequestDispatcher("updateDependent.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Dependent d = new Dependent();
		d.setDependentid(Integer.parseInt(request.getParameter("dependentid")));
		d.setDependentname(request.getParameter("dependentname"));
		d.setTelephoneno(Integer.parseInt(request.getParameter("telephoneno")));
		
		dao.updateDependent(d); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("dependents",DependentDAO.getAllDependents());
		RequestDispatcher view = request.getRequestDispatcher("listDependent.jsp");
		view.forward(request, response);
	}
}
