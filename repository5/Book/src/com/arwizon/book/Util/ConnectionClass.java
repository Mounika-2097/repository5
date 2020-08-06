package com.arwizon.book.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionClass 
{

		
		public static Connection Connectiondb() {
			Connection con=null;;
			try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			   con=DriverManager.getConnection("jdbc:mysql://localhost:3307/arwizon","root","root");
			  
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return con;
		}

	}

