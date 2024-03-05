import java.sql.*;
public class create_table {
  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/sdi";

    Connection con = DriverManager.getConnection(url, "root", "");
    Statement stmt = con.createStatement();
    stmt.execute("create table student(id int, name varchar(20))");
    System.out.println("Success");
    con.close();
  }
}
