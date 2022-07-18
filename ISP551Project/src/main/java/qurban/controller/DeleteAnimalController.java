package qurban.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.AnimalDAO;

@WebServlet("/DeleteAnimalController")
public class DeleteAnimalController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private AnimalDAO dao;
	
	public DeleteAnimalController() {
		super();
		dao = new AnimalDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		int animalid = Integer.parseInt(request.getParameter("aid"));
		String aid = request.getParameter("animalid");
		dao.deleteAnimal(animalid);
		request.setAttribute("animals", AnimalDAO.getAllAnimals());
		RequestDispatcher view = request.getRequestDispatcher("listAnimal.jsp");
		view.forward(request, response);
	}
}
