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
 * Servlet implementation class ViewCustomerController
 */
@WebServlet("/ViewDependentController")
public class ViewDependentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DependentDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDependentController() {
        super();
        dao = new DependentDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int dependentid =Integer.parseInt(request.getParameter("dependentid"));
		int dependentid = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("dependentid");
		request.setAttribute("d",DependentDAO.getDependentById(dependentid));
		RequestDispatcher view = request.getRequestDispatcher("viewDependent.jsp");
		view.forward(request, response);
	}


}
