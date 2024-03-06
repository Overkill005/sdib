import java.sql.*;

public class autocommit {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/sdi";
    try {
      Connection con = DriverManager.getConnection(url, "root", "");
      con.setAutoCommit(false);
      String sql = "insert into student values(?,?)";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setInt(1, 90);
      stmt.setString(2, "Rahul");
      int num = stmt.executeUpdate();
      con.commit();
      if (num > 0) {
        System.out.println("save success");
      } else {
        System.out.println("any issues...");
      }
    con.close();
    } 
    catch(SQLException e){

    }
  }
}
