package com.arwizon.book.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.arwizon.book.Bookdata;
import com.arwizon.book.Util.ConnectionClass;



public class BookInterfaceimple implements BookInterface {
	Connection con =ConnectionClass.Connectiondb();
	public void addProduct(String name, String type, String author, int price) {
		try {

			String sql = "insert into number values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			Bookdata p=new Bookdata();
			stmt.setInt(1,p.getCount());
			stmt.setString(2,name);
			stmt.setString(3,type);
			stmt.setString(4,author);
			stmt.setint(5,price1);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		public Set<Bookdata> displayProduct()
		{
			int Bookid=0;
			Set<Bookdata> m1 = new HashSet<Bookdata>();
			Connection con = ConnectionClass.Connectiondb();
			try {

				String sql = "select * from number";
				PreparedStatement stmt = con.prepareStatement(sql);
			   
				
				ResultSet rs=stmt.executeQuery();
				
				while(rs.next()) {
					Bookdata bd=new Bookdata();
					bd.setBookid(rs.getInt(1));
					bd.setName(rs.getString(2));
					bd.setType(rs.getString(3));
					bd.setAuthor(rs.getString(4));
					Object pd1;
					bd.add(pd1);	             
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
			public Set<Bookdata> searchProduct(String name) {

				Set<Bookdata> m2 = new HashSet<Bookdata>();
				Connection con = ConnectionClass.Connectiondb();
				try {

					String sql = "select * from number where name=?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, name);
					ResultSet rs=stmt.executeQuery();
					
					while(rs.next()) {
						Bookdata pd1=new Bookdata();
						pd1.setBookid(rs.getInt(1));
						pd1.setName(rs.getString(2));
						pd1.setType(rs.getString(3));
						pd1.setAuthor(rs.getString(4));
						pd1.setPrice(rs.getInt(5));
					}
						
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return m2;

			}
			
			public void updateProduct(int Bookid) {
				
				String sql="update Products set noOfUnits=? where productId=?";
				try {
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setInt(2, Bookid);
					
					stmt.executeUpdate();

					} catch (SQLException e) {
						e.printStackTrace();
					}
			
			
		}

		
		
	}
	
