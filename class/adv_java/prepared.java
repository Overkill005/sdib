import java.sql.*;

public class prepared {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/sdi";
    Connection con = DriverManager.getConnection(url, "root", "");
    PreparedStatement prstmt = con.prepareStatement(
      "insert into student values(?,?)"
    );
    prstmt.setInt(1, 50);
    prstmt.setString(2, "Hello");
    prstmt.executeUpdate();
    System.out.println("insert success");
  }
}
