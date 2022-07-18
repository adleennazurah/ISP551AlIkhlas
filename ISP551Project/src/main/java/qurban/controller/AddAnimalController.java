package qurban.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.AnimalDAO;
import qurban.model.Animal;

/**
 * Servlet implementation class AddAnimalController
 */
@WebServlet("/AddAnimalController")
public class AddAnimalController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private AnimalDAO dao;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public AddAnimalController() {
		super();
		dao = new AnimalDAO();
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Animal an = new Animal();
		
		an.setAnimalname(request.getParameter("animalname"));
		an.setAnimalqty(Integer.parseInt(request.getParameter("animalqty")));
		an.setAnimalprice(Double.parseDouble(request.getParameter("animalprice")));
		
		
		dao.addAnimal(an); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("animals", AnimalDAO.getAllAnimals());
		RequestDispatcher view = request.getRequestDispatcher("listAnimal.jsp");
		view.forward(request, response);
		
	}
	}