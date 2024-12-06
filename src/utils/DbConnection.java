package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
  private static Connection connection;

  public static Connection getConnection(){
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_book_store", "root", "password");

      System.out.println("Connection Esthablished!");
    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println("Connection Aborted!");
    }
    return connection;
  }
  
}
