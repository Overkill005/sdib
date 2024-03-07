import java.sql.*;

public class oraclexe_db_insert {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Connection con = DriverManager.getConnection(url, "SYSTEM", "krishi2022");
    Statement stmt = con.createStatement();
    stmt.execute("insert into student values(20,'Sanskar')");
    System.out.println("Success");
    con.close();
  }
}
