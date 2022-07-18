package qurban.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qurban.dao.OrderDAO;

@WebServlet("/ViewOrderController")
public class ViewOrderController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private OrderDAO dao;
	
	public ViewOrderController() {
		super();
		dao = new OrderDAO();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int orderId = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("orderId");
		request.setAttribute("od", OrderDAO.getOrderById(orderId));
		RequestDispatcher view = request.getRequestDispatcher("viewOrder.jsp");
		view.forward(request, response);
	}
}
