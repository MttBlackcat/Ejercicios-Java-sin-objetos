package com.programcreek.helloworld;
//STEP 1. Import required packages
import java.sql.*;

public class FirstExample {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
 static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=pre-cmc-2020-05-20";
 
 //  Database credentials
 static final String USER = "test";
 static final String PASS = "1234";
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    String sql;
    sql = "SELECT id, firstName, lastName, name FROM Actors";
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int id  = rs.getInt("id");
       String name = rs.getString("name");
       String first = rs.getString("firstName");
       String last = rs.getString("lastName");

       //Display values
       System.out.print("ID: " + id);
       System.out.print(", Name: " + name);
       System.out.print(", First Name: " + first);
       System.out.println(", Last Name: " + last);
    }
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}//end FirstExample