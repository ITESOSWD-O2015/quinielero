package com.iteso.quinielero.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseConnection {
    public static ResultSet queryStatement(String query) throws SQLException {
        MysqlDataSource database = null;
        Connection connect = null;
        Statement statement = null;
   
        // Create a new DataSource (MySQL specifically)
        // and provide the relevant information to be used by Tomcat.
        database = new MysqlDataSource();
        database.setUrl("jdbc:mysql://db4free.net:3306/quinielero");
        database.setUser("quinielero");
        database.setPassword("softwaredesign");
        connect = database.getConnection();
        
        // Create the statement to be used to get the results.
        statement = connect.createStatement();
 
        // Execute the query and get the result set.
        ResultSet resultSet = statement.executeQuery(query);
        
        //Return query
        if(resultSet.next()) {
        	return resultSet;
        } else {
        	return null;
        }
    }
    public static void updateStatement(String query) throws SQLException {
    	  MysqlDataSource database = null;
    	Connection connect = null;
    	Statement statement = null;
    	// Create a new DataSource (MySQL specifically)
    	// and provide the relevant information to be used by Tomcat.
    	database = new MysqlDataSource();
    	database.setUrl("jdbc:mysql://db4free.net:3306/quinielero");
    	database.setUser("quinielero");
    	database.setPassword("softwaredesign");
    	connect = database.getConnection();
    	// Create the statement to be used to get the results.
    	statement = connect.createStatement();
    	// Update the database
    	statement.executeUpdate(query);
    	}
    
}
