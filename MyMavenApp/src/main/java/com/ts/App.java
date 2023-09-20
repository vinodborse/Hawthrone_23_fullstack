package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	String url = "jdbc:mysql://localhost:3306/tsdb";
    	String username = "root";
    	String password ="root";
    	
    	Connection connection = DriverManager.getConnection(url, username, password);
    	Statement st = connection.createStatement();
    	
    	ResultSet rs =  st.executeQuery("SELECT * FROM student WHERE rollno = 4");
    
    	while(rs.next()) {
    		System.out.println(
    							rs.getInt("rollno") + " " + 
    							rs.getString("name") + " "+ 
    							rs.getString("address")
    						);
    	}
    	
    	connection.close();
    }
}

/*
Mobile
number
connection
statement
response
cut
*/