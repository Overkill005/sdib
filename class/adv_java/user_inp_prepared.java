import java.sql.*;
import java.util.*;

public class user_inp_prepared {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/sdi";
    int id;
    String name, tab;
    Connection con;
    PreparedStatement prstmt;
    con = DriverManager.getConnection(url, "root", "");
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Enter I for insert, U for update, D for delete, S for select, C to stop"
    );
    String status = sc.next();
    while (!status.equalsIgnoreCase("C")) {
      switch (status) {
        case "I":
        case "i":
          System.out.println("Enter id and name to insert : ");
          id = sc.nextInt();
          name = sc.next();
          prstmt = con.prepareStatement("insert into student values(?,?)");
          prstmt.setInt(1, id);
          prstmt.setString(2, name);
          prstmt.executeUpdate();
          System.out.println("1 row inserted");
          break;
        case "U":
        case "u":
          System.out.println("Enter id for which name is to be updated : ");
          id = sc.nextInt();
          System.out.println("Enter updated name : ");
          name = sc.next();
          prstmt = con.prepareStatement("update student set name=? where id= ? ");
          prstmt.setInt(2, id);
          prstmt.setString(1, name);
          prstmt.executeUpdate();
          System.out.println("1 row updated");
          break;
        case "D":
        case "d":
          System.out.println("Enter id which is to be deleted : ");
          id = sc.nextInt();
          prstmt = con.prepareStatement("delete from student where id= ? ");
          prstmt.setInt(1, id);
          prstmt.executeUpdate();
          System.out.println("1 row deleted");
          break;
        case "S":
        case "s":
          System.out.println("+---------------+---------------+");
          System.out.println("|  ID \t\t|  Name\t\t|");
          System.out.println("+---------------+---------------+");
          prstmt = con.prepareStatement("select * from student");
          ResultSet rs = prstmt.executeQuery();
          while (rs.next()) {
            if (rs.getString(2).length() > "\t".length()) {
              tab = "\t|";
            } else {
              tab = "\t\t|";
            }
            System.out.println(
                "|  " + rs.getInt(1) + "\t\t|  " + rs.getString(2) + tab);   //also can write column name
          }
          rs.close();
          System.out.println("+---------------+---------------+");
          break;
        default:
          break;
      }
      System.out.println(
          "Enter I for insert, U for update, D for delete, S for select, C to stop");
      status = sc.next();
    }
    sc.close();

  }
}
