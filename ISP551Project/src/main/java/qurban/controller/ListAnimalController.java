package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.AnimalDAO;
/**
 * Servlet implementation class ListShawlController
 */
@WebServlet("/ListAnimalController")
public class ListAnimalController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private AnimalDAO dao;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public ListAnimalController() {
		super();
		dao = new AnimalDAO();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("animals", AnimalDAO.getAllAnimals());
		RequestDispatcher view = request.getRequestDispatcher("listAnimal.jsp");
		view.forward(request,response);
}
}
