package qurban.dao;

import java.sql.*;
import java.util.*;
import qurban.db.ConnectionManager;
import qurban.model.Animal;
public class AnimalDAO {
	
			static Connection con = null;
			static PreparedStatement ps = null;
			static Statement stmt = null;
			static ResultSet rs = null;
			private int animalid, animalqty;
			private String  animalname;
			private double animalprice;
			
			//add shawl
			public void addAnimal(Animal bean ) {
				animalname = bean.getAnimalname();
				animalqty = bean.getAnimalqty();
				animalprice = bean.getAnimalprice();
				
			//query to database
			try {
				//2. call getConnection() method 
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps = con.prepareStatement("INSERT INTO animals(animalname,animalqty,animalprice) values(?,?,?)");
				ps.setString(1,animalname);
				ps.setInt(2, animalqty);
				ps.setDouble(3,animalprice);
			
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
		public static List<Animal> getAllAnimals()
		{
			List<Animal> animals = new ArrayList <Animal>();
			
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3.create statement
				stmt = con.createStatement();
				String sql = "SELECT * FROM animals ORDER BY animalid";
				
				//4.execute query
				rs = stmt.executeQuery(sql);
				
				while(rs.next())  //process result
				{
					Animal an = new Animal();
					an.setAnimalid(rs.getInt("animalid"));
					an.setAnimalname(rs.getString("animalname"));
					an.setAnimalqty(rs.getInt("animalqty"));
					an.setAnimalprice(rs.getDouble("animalprice"));
					animals.add(an);
					
				}
				//5. close connection
				con.close();
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return animals;
		}

		// view shawl
		public static Animal getAnimalById (int animalid)
		{
			Animal an = new Animal();
			try {
				//call getConnection() method
				con = ConnectionManager.getConnection();
				
				//3. create statement
				ps = con.prepareStatement("SELECT * FROM animals WHERE animalid=?");
				ps.setInt(1, animalid);
				
				//4.execute query
				rs = ps.executeQuery();
				if(rs.next()) {
					an.setAnimalid(rs.getInt("animalid"));
					an.setAnimalname(rs.getString("animalname"));
					an.setAnimalqty(rs.getInt("animalqty"));
					an.setAnimalprice(rs.getDouble("animalprice"));
				}
				//5 close connection
				con.close();
				
			} catch(Exception  e) {
				e.printStackTrace();
			} return an;
		}
			//delete shawl
			public void deleteAnimal(int animalid) {
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//3. create statement
					ps = con.prepareStatement("DELETE from animals WHERE animalid=?");
					ps.setInt(1, animalid);
					
					//4. execute query
					ps.executeUpdate();
					
					//5. close connection
					con.close();
					
				}catch(Exception  e) {
					e.printStackTrace();
				} 
			}
			//update shawl
			public void updateAnimal(Animal bean) {
				animalid = bean.getAnimalid();
				animalname = bean.getAnimalname();
				animalqty = bean.getAnimalqty();
				animalprice = bean.getAnimalprice();
				
				
				try {
					//call getConnection() method
					con = ConnectionManager.getConnection();
					
					//3. create statement
					ps= con.prepareStatement("UPDATE animals SET animalname=?,animalqty=?,animalprice=? WHERE animalid=?");
					ps.setString(1, animalname);
					ps.setInt(2, animalqty);
					ps.setDouble(3,animalprice);
					ps.setInt(4,animalid);
					
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