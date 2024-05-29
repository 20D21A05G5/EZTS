package com.Gadda.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DBConnection {
	
	private DataSource dataSource;

	public DBConnection(DataSource theDataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = theDataSource;
	}

	public List<SettersGetters> getStudents() {
		// TODO Auto-generated method stub
		List<SettersGetters> Students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String s = "Select * from Product";
			
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(s);
			
			while(myRs.next()) {
				String Product_ID = myRs.getString("Product_ID");
				String NAME = myRs.getString("Name");
				String Brand = myRs.getString("Brand");
				String Category = myRs.getString("Category");
				Int Price = myRs.getInt("Price");
				
				SettersGetters tempProduct = new SettersGetters(Product_ID, NAME, Brand, Category, Price);
				
				Product1.add(tempProduct);
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
	
	
	public void add Product(SettersGetters newProduct) {
		// TODO Auto-generated method stub
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		
		
		
				
				try {
					myConn =dataSource.getConnection();
					
					String S = "insert into Product"+
							 "(Product_ID,NAME,Brand,Category,Price)"+
							"values(?,?,?,?,?)";
					
					myStmt=myConn.prepareStatement(S);
					
					myStmt.setString(1, newProduct.getProduct_ID());
					myStmt.setString(2, newProduct.getName());
					myStmt.setString(3, newProduct.getBrand());
					myStmt.setString(4, newProduct.getCategory());
					myStmt.setInt(5, newProduct.getPrice());
					
					myStmt.execute();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					close(myConn,myStmt,null);
				}
		
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

	
	

}
