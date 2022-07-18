package qurban.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import qurban.db.ConnectionManager;
import qurban.model.Order;


public class OrderDAO {
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	private int orderId, custId;
	private String animalId,orderPart,orderDate;

	
	//add order
	public void addOrder(Order bean) {
		custId = bean.getCustId();
		animalId = bean.getAnimalId();
		orderPart = bean.getOrderPart();
		orderDate = bean.getOrderDate();
		
		
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			//create statement
			ps = con.prepareStatement("INSERT INTO ordercust(custId, animalId, orderPart, orderDate) values(?,?,?,?)");
			ps.setInt(1,custId);
			ps.setString(2,animalId);
			ps.setString(3,orderPart);
			ps.setString(4,orderDate);
		
			
			//execute query
			ps.executeUpdate();
			System.out.println("Successfully inserted");
			
			//close connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//get all products
	public static List<Order> getAllOrders() {
		List<Order> orders = new ArrayList<Order>();
		
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			//create statement
			stmt = con.createStatement();
			String sql = "SELECT * FROM ordercust ORDER BY orderId";
			
			//execute query
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {		//process result
				Order od = new Order();
				od.setOrderId(rs.getInt("orderId"));
				od.setCustId(rs.getInt("custId"));
				od.setAnimalId(rs.getString("animalId"));
				od.setOrderPart(rs.getString("orderPart"));
				od.setOrderDate(rs.getString("orderDate"));
				
				orders.add(od);
			}
			
			//close connection
			con.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return orders;
	}	

	//get order by id or view order 
	public static Order getOrderById(int orderId) 
	{
		Order od = new Order();
		try {
			//call getConnection method
			con = ConnectionManager.getConnection();
			
			//create statement
			ps= con.prepareStatement("SELECT * FROM ordercust WHERE orderId=?");
			ps.setInt(1, orderId);
			
			//execute query
			rs = ps.executeQuery();
			if(rs.next()) {	
				od.setOrderId(rs.getInt("orderId"));
				od.setCustId(rs.getInt("custId"));
				od.setAnimalId(rs.getString("animalId"));
				od.setOrderPart(rs.getString("orderPart"));
				od.setOrderDate(rs.getString("orderDate"));		
			}
			
			//close connection
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return od;
	}
	
	//delete order
	public void deleteOrder(int orderId) {
		try {
			//call getConnection method
			con = ConnectionManager.getConnection();
			
			//create statement
			ps = con.prepareStatement("DELETE FROM ordercust WHERE orderId=?");
			ps.setInt(1, orderId);
			
			//execute query
			ps.executeUpdate();
			
			//close connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//update order
	public void updateOrder(Order bean) {
		orderId = bean.getOrderId();
		custId = bean.getCustId();
		animalId = bean.getAnimalId();
		orderPart = bean.getOrderPart();
		orderDate = bean.getOrderDate();
		
		try {
			//call getConnection method
			con = ConnectionManager.getConnection();
			
			//create statement
			ps = con.prepareStatement("UPDATE ordercust SET custId=?, animalId=?, orderPart=?, orderDate=? WHERE orderId=?");
			ps.setInt(1,custId);
			ps.setString(2, animalId);
			ps.setString(3,orderPart);
			ps.setString(4,orderDate);
			ps.setInt(5,orderId);
			
			//execute query
			ps.executeUpdate();
			
			System.out.println("Successfully updated");
			
			//close connection
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

