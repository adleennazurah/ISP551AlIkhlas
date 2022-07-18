package qurban.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qurban.dao.*;
import qurban.model.*;

/**
 * Servlet implementation class UpdateOrderController
 */
@WebServlet("/UpdateOrderController")
public class UpdateOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrderDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOrderController() {
        super();
        dao = new OrderDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int orderId = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("orderId");
		request.setAttribute("od", OrderDAO.getOrderById(orderId));
		RequestDispatcher view = request.getRequestDispatcher("updateOrder.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Order od = new Order ();
		od.setOrderId(Integer.parseInt(request.getParameter("orderId")));
		od.setCustId(Integer.parseInt(request.getParameter("custId")));
		od.setAnimalId(request.getParameter("animalId"));
		od.setOrderPart(request.getParameter("orderPart"));
		od.setOrderDate(request.getParameter("orderDate"));
		
		dao.updateOrder(od);
		
		request.setAttribute("orders", OrderDAO.getAllOrders());
		RequestDispatcher view = request.getRequestDispatcher("listOrder.jsp");
		view.forward(request, response);
	}
}


