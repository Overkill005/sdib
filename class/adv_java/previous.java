import java.sql.*;
public class previous {
  public static void main(String[] args) throws SQLException{
    String url="jdbc:mysql://localhost:3306/sdi";
    Connection con = DriverManager.getConnection(url, "root", "");
    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String sql = "select * from student";
    ResultSet rs = stmt.executeQuery(sql);
    rs.next();
    System.out.println(rs.getString("name"));
    rs.next();
    System.out.println(rs.getString("name"));
    rs.previous();
    System.out.println(rs.getString("name"));
  }
}
