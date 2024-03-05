import java.sql.*;
public class create_db {
  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/";

    Connection con = DriverManager.getConnection(url, "root", "");
    Statement stmt = con.createStatement();
    stmt.execute("create database sdi");
    System.out.println("Success");
    con.close();
  }
}
