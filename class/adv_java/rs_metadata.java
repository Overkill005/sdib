import java.sql.*;

public class rs_metadata {

  public static void main(String[] args) throws SQLException {
    Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/sdi",
      "root",
      ""
    );
    PreparedStatement ps = con.prepareStatement("select * from student");
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rsnd = rs.getMetaData();
    System.out.println("Total columns : " + rsnd.getColumnCount());
    System.out.println("1st column : " + rsnd.getColumnName(1));
    System.out.println("Type of 1st column : " + rsnd.getColumnTypeName(1));
  }
}
/* Output:

Total columns : 2
1st column : id
Type of 1st column : INT 

*/
