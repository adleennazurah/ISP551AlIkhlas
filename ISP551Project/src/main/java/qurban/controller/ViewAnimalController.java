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
 * Servlet implementation class ViewCustomerController
 */
@WebServlet("/ViewAnimalController")
public class ViewAnimalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AnimalDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAnimalController() {
        super();
        dao = new AnimalDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int animalid = Integer.parseInt(request.getParameter("aid"));
		String aid = request.getParameter("animalid");
		request.setAttribute("an",AnimalDAO.getAnimalById(animalid));
		RequestDispatcher view = request.getRequestDispatcher("viewAnimal.jsp");
		view.forward(request, response);
	}


}
