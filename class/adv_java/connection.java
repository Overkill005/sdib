import java.sql.*;

class connection {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/";

    Connection con = DriverManager.getConnection(url, "root", "");
    System.out.println("Success");
    con.close();
  }
}
/* after this set class path using          ...............             set classpath=;C:\Users\RISE202312JAVA32\Documents\GitHub\sdib\class\adv_java\mysql-connector-j-8.3.0.jar

import java.sql.*;

class test {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/";
    try {
      Connection con = DriverManager.getConnection(url, "root", "");
      System.out.println("Success");
      con.close();
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
 */
