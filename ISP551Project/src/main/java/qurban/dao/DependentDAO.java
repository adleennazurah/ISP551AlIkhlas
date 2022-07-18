package qurban.dao;

import java.sql.*;
import java.util.*;
import qurban.db.ConnectionManager;
import qurban.model.Dependent;

public class DependentDAO {
		static Connection con = null;
		static PreparedStatement ps = null;
		static Statement stmt = null;
		static ResultSet rs = null;
		private int dependentid, telephoneno;
		private String  dependentname;
		
		//add shawl
		public void addDependent(Dependent bean ) {
			dependentname = bean.getDependentname();
			telephoneno = bean.getTelephoneno();
			
		//query to database
		try {
			//2. call getConnection() method 
			con = ConnectionManager.getConnection();
			
			//3. create statement
			ps = con.prepareStatement("INSERT INTO dependent(dependentname,telephoneno) values(?,?)");
			ps.setString(1,dependentname);
			ps.setInt(2, telephoneno);
			
		
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
	public static List<Dependent> getAllDependents()
	{
		List<Dependent> dependents = new ArrayList <Dependent>();
		
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			//3.create statement
			stmt = con.createStatement();
			String sql = "SELECT * FROM dependent ORDER BY dependentid";
			
			//4.execute query
			rs = stmt.executeQuery(sql);
			
			while(rs.next())  //process result
			{
				Dependent d = new Dependent();
				d.setDependentid(rs.getInt("dependentid"));
				d.setDependentname(rs.getString("dependentname"));
				d.setTelephoneno(rs.getInt("telephoneno"));
				dependents.add(d);
				
			}
			//5. close connection
			con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dependents;
	}

	// view shawl
	public static Dependent getDependentById (int dependentid)
	{
		Dependent d = new Dependent();
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			//3. create statement
			ps = con.prepareStatement("SELECT * FROM dependent WHERE dependentid=?");
			ps.setInt(1, dependentid);
			
			//4.execute query
			rs = ps.executeQuery();
			if(rs.next()) {
				d.setDependentid(rs.getInt("dependentid"));
				d.setDependentname(rs.getString("dependentname"));
				d.setTelephoneno(rs.getInt("telephoneno"));
				
			}
			//5 close connection
			con.close();
			
		} catch(Exception  e) {
			e.printStackTrace();
		} return d;
	}
		//delete shawl
		public void deleteDependent(int dependentid) {
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps = con.prepareStatement("DELETE from dependent WHERE dependentid=?");
				ps.setInt(1, dependentid);
				
				//4. execute query
				ps.executeUpdate();
				
				//5. close connection
				con.close();
				
			}catch(Exception  e) {
				e.printStackTrace();
			} 
		}
		//update shawl
		public void updateDependent(Dependent bean) {
			dependentid = bean.getDependentid();
			dependentname = bean.getDependentname();
			telephoneno = bean.getTelephoneno();
			
			
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps= con.prepareStatement("UPDATE dependent SET dependentname=?,telephoneno=? WHERE dependentid=?");
				ps.setString(1, dependentname);
				ps.setInt(2, telephoneno);
				ps.setInt(3,dependentid);
				
				//4. execute query
				ps.executeUpdate();
				
				System.out.println("Successfully updated");
				
				//5. close connection
				con.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

