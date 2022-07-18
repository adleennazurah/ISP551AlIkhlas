package qurban.dao;

import java.sql.*;
import java.util.*;
import qurban.db.ConnectionManager;
import qurban.model.Customer;


public class CustomerDAO {
	
			static Connection con = null;
			static PreparedStatement ps = null;
			static Statement stmt = null;
			static ResultSet rs = null;
			private int custid, custnumber,id;
			private String  custname,custaddress,custemail;
			
			//add shawl
			public void addCustomer(Customer bean) {
				custname = bean.getCustname();
				custemail = bean.getCustemail();
				custaddress=bean.getCustaddress();
				custnumber=bean.getCustnumber();
				
				
				
			//query to database
			try {
				//2. call getConnection() method 
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps = con.prepareStatement("INSERT INTO customer(custname,custemail,custaddress,custnumber,id) values(?,?,?,?,?)");
				ps.setString(1,custname);
				ps.setString(2,custemail);
				ps.setString(3, custaddress);
				ps.setInt(4, custnumber);
				
				ps.setInt(5, id);
			
				//4. execute query 
				ps.executeUpdate();
				System.out.println("Successfully inserted");
			
				//5. close connection
				con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}

		//get all shawls
		public static List<Customer> getAllCustomers()
		{
			List<Customer> customers = new ArrayList <Customer>();
			
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3.create statement
				stmt = con.createStatement();
				String sql = "SELECT * FROM customer ORDER BY custid";
				
				//4.execute query
				rs = stmt.executeQuery(sql);
				
				while(rs.next())  //process result
				{
					Customer c = new Customer();
					c.setCustid(rs.getInt("custid"));
					c.setCustname(rs.getString("custname"));
					c.setCustemail(rs.getString("custemail"));
					c.setCustaddress(rs.getString("custaddress"));
					c.setCustnumber(rs.getInt("custnumber"));
					
					customers.add(c);
					
				}
				//5. close connection
				con.close();
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return customers;
		}

		//get customer by Id
		public static Customer getCustomerId(int custid) {
			Customer c = new Customer();
			try {
				//call getConnection() method  
				con = ConnectionManager.getConnection();
				//3. create statement  
				ps=con.prepareStatement("select * from customer where custid=?");
				ps.setInt(1, custid);
				//4. execute query
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {	            
					c.setCustid(rs.getInt("custid"));
					c.setCustname(rs.getString("custname"));
					c.setCustemail(rs.getString("custemail"));
					c.setCustaddress(rs.getString("custaddress"));
					c.setCustnumber(rs.getInt("custnumber"));
					c.setId(rs.getInt("id"));
				}
				//5. close connection
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			
			}

			return c;
		}


		public static List<Customer> getCustomerId() {
			List<Customer> cs = new ArrayList<Customer>();
			try {
				//call getConnection() method  			
				con = ConnectionManager.getConnection();
				//3. create statement  
				stmt = con.createStatement();
				//4. execute query
				ResultSet rs = stmt.executeQuery("select custid, custname  from customer");

				while (rs.next()) {
					Customer c = new Customer();
					c.setCustid(rs.getInt("custid"));
					c.setCustname(rs.getString("custname"));
					cs.add(c);

				}
				//5. close connection
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			
			}

			return cs;
		}
		
		// view shawl
		public static Customer getCustomerById (int custid)
		{
			Customer c = new Customer();
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps = con.prepareStatement("SELECT * FROM customer WHERE custid=?");
				ps.setInt(1, custid);
				
				//4.execute query
				rs = ps.executeQuery();
				if(rs.next()) {
					c.setCustid(rs.getInt("custid"));
					c.setCustname(rs.getString("custname"));
					c.setCustemail(rs.getString("custemail"));
					c.setCustaddress(rs.getString("custaddress"));
					c.setCustnumber(rs.getInt("custnumber"));
				
					
				}
				//5 close connection
				con.close();
				
			} catch(Exception  e) {
				e.printStackTrace();
			} return c;
		}
			//delete shawl
			public void deleteCustomer(int custid) {
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//3. create statement
					ps = con.prepareStatement("DELETE from customer WHERE custid=?");
					ps.setInt(1, custid);
					
					//4. execute query
					ps.executeUpdate();
					
					//5. close connection
					con.close();
					
				}catch(Exception  e) {
					e.printStackTrace();
				} 
			}
			//update customer
			public void updateCustomer(Customer bean) {
				custid = bean.getCustid();
				custname = bean.getCustname();
				custemail = bean.getCustemail();
				custaddress = bean.getCustaddress();
				custnumber = bean.getCustnumber();
				
				
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//3. create statement
					ps= con.prepareStatement("UPDATE customer SET custname=?,custemail=?,custaddress=?,custnumber=?WHERE custid=?");
					ps.setString(1, custname);
					ps.setString(2, custemail);
					ps.setString(3,custaddress);
					ps.setInt(4, custnumber);
					ps.setInt(5,custid);
					
			
					ps.executeUpdate();
					
					System.out.println("Successfully updated");
					
					con.close();
					
				}catch (Exception e) {
			          e.printStackTrace();
			    }
			}
		}
