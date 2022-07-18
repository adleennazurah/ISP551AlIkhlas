package qurban.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import qurban.db.ConnectionManager;
import qurban.model.Admin;

public class AdminDAO {

	static Connection con = null;
	static ResultSet rs = null; 
	static PreparedStatement ps=null;
	static Statement stmt=null;
	String adminname;
	int adminid; 	

	//list supplier
	public static List<Admin> getAllAdmin() {
		List<Admin> admin = new ArrayList<Admin>();
		try {
			//call getConnection() method 
			con = ConnectionManager.getConnection();
			//3. create statement 
			stmt = con.createStatement();
			//4. execute query
			rs = stmt.executeQuery("select * from admin order by adminid");

			while (rs.next()) {
				Admin a = new Admin();
				a.setAdminId(rs.getInt("adminid"));
				a.setAdminName(rs.getString("adminname"));
				a.setId(rs.getInt("id"));
				admin.add(a);

			}
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}

		return admin;
	}


	//get admin by adminid
	public static Admin getAdminById(int adminid) {
		Admin a = new Admin();
		try {
			//call getConnection() method 
			con = ConnectionManager.getConnection();
			//3. create statement 
			ps=con.prepareStatement("select * from admin where adminid=?");
			ps.setInt(1, adminid);
			//4. execute query
			rs = ps.executeQuery();
			if (rs.next()) {	            
				a.setAdminId(rs.getInt("adminid"));
				a.setAdminName(rs.getString("adminname"));
				a.setId(rs.getInt("id"));
			}
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}

		return a;
	}

	//get admin by Id
	public static Admin getAdminId(int adminid) {
		
		Admin a = new Admin();
		try {
			//call getConnection() method 
			con = ConnectionManager.getConnection();
			//3. create statement 
			ps=con.prepareStatement("select * from admin where adminid=?");
			ps.setInt(1, adminid);
			//4. execute query
			rs = ps.executeQuery();

			if (rs.next()) {	            
				a.setAdminId(rs.getInt("adminid"));
				a.setAdminName(rs.getString("adminname"));
				a.setId(rs.getInt("id"));
			}
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}

		return a;
	}


	public static List<Admin> getAdminId() {
		List<Admin> admin = new ArrayList<Admin>();
		try {
			//call getConnection() method 
			con = ConnectionManager.getConnection();
			//3. create statement 
			stmt = con.createStatement();
			//4. execute query
			rs = stmt.executeQuery("select adminid, adminname  from admin");
			while (rs.next()) {
				Admin a = new Admin();
				a.setAdminId(rs.getInt("adminid"));
				a.setAdminName(rs.getString("adminname"));
				admin.add(a);

			}
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}

		return admin;
	}

	//update admin
	public void updateAdmin(Admin bean) {

		adminid = bean.getAdminId();
		adminname = bean.getAdminName();	

		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();
			//3. create statement 
			ps=con.prepareStatement("update admin set adminname=? WHERE adminid=?"); 		  
			ps.setString(1,adminname); //1 specifies the first parameter in the query i.e. name			
			ps.setInt(2,adminid);
			//4. execute query
			ps.executeUpdate();
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}

	
}
