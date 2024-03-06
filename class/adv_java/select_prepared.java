import java.sql.*;

public class select_prepared {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/sdi";
    String tab;
    Connection con = DriverManager.getConnection(url, "root", "");
    System.out.println("+---------------+---------------+");
    System.out.println("|  ID \t\t|  Name\t\t|");
    System.out.println("+---------------+---------------+");
    PreparedStatement prstmt = con.prepareStatement(
      "select * from student where id= ?"
    );
    prstmt.setInt(1, 50);
    ResultSet rs = prstmt.executeQuery();
    while (rs.next()) {
      if (rs.getString(2).length() > "\t".length()) {        //
        tab = "\t|";                                                     //
      } else {                                                           // not important
        tab = "\t\t|";                                                   //
      }                                                                  //
      System.out.println(
        "|  " + rs.getInt(1) + "\t\t|  " + rs.getString(2) + tab
      );                                                                                 //  also can write column name
    }
    rs.close();
    System.out.println("+---------------+---------------+");
  }
}
