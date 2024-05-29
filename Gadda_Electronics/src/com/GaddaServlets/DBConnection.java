package com.GaddaServlets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
public class DBConnection {
	
	private DataSource dataSource;
	public DBConnection(DataSource theDataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = theDataSource;
	}
	public List<SettersGetters> getProduct() {
		// TODO Auto-generated method stub
		List<SettersGetters> Product = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String s = "Select * from Product";
			
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(s);
			
			while(myRs.next()) {
				String Product_ID = myRs.getString("Product_id");
				String NAME = myRs.getString("Name");
				String Brand = myRs.getString("Brand");
				String Category = myRs.getString("Category");
				int Price = myRs.getInt("Price");
				
				SettersGetters tempStudent = new SettersGetters(Product_ID, NAME,Brand, Category, Price);
				
				Product.add(tempStudent);
			}
			
			System.out.println(Product);
			return Product;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(myConn,myStmt,myRs);
		}
		
		
		return null;
	}
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myRs !=null) {
				myRs.close();
			}
			
			if(myStmt !=null) {
				myStmt.close();
			}
			
			if(myConn !=null) {
				myConn.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void add(SettersGetters newproduct) {
		// TODO Auto-generated method stub
		
	}
	
}
