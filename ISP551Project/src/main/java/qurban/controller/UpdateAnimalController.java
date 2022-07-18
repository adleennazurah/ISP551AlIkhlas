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

@WebServlet("/UpdateAnimalController")
public class UpdateAnimalController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private AnimalDAO dao;
	
	public UpdateAnimalController() {
		super();
		dao = new AnimalDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//int dependentid = Integer.parseInt(request.getParameter("dependentid"));
		int animalid = Integer.parseInt(request.getParameter("aid"));
		String aid = request.getParameter("animalid");
		request.setAttribute("an", AnimalDAO.getAnimalById(animalid));
		RequestDispatcher view = request.getRequestDispatcher("updateAnimal.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Animal an = new Animal();
		an.setAnimalid(Integer.parseInt(request.getParameter("animalid")));
		an.setAnimalname(request.getParameter("animalname"));
		an.setAnimalqty(Integer.parseInt(request.getParameter("animalqty")));
		an.setAnimalprice(Double.parseDouble(request.getParameter("animalprice")));
		
		dao.updateAnimal(an); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("animals",AnimalDAO.getAllAnimals());
		RequestDispatcher view = request.getRequestDispatcher("listAnimal.jsp");
		view.forward(request, response);
	}
}
