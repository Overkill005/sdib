import java.sql.*;

public class db_metadata {

  public static void main(String[] args) throws SQLException {
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/sdi",
      "root",
      ""
    );
    DatabaseMetaData rsnd = con.getMetaData();
    System.out.println("Driver name : " + rsnd.getDriverName());
    System.out.println("Driver version : " + rsnd.getDriverVersion());
    System.out.println("User name : " + rsnd.getUserName());
    System.out.println(
      "Database product name : " + rsnd.getDatabaseProductName()
    );
    System.out.println(
      "Database product version : " + rsnd.getDatabaseProductVersion()
    );
  }
}
/* Output:

Driver name : MySQL Connector/J
Driver version : mysql-connector-j-8.3.0 (Revision: 805f872a57875f311cb82487efcfb070411a3fa0)
User name : root@
Database product name : MySQL
Database product version : 5.5.5-10.4.32-MariaDB

*/
