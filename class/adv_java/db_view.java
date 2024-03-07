import java.sql.*;

public class db_view {

  public static void main(String[] args) throws SQLException {
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306",
      "root",
      ""
    );
    DatabaseMetaData dmd = con.getMetaData();
    String table[] = { "VIEW" };
    ResultSet rs = dmd.getTables(null, null, null, table);
    while (rs.next()) {
      System.out.println(rs.getString(3));
    }
  }
}
