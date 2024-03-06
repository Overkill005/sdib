import java.sql.*;
import java.util.*;

public class user_input_table {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/sdi";
    Connection con = DriverManager.getConnection(url, "root", "");
    Statement stmt = con.createStatement();
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "I for insert, D for delete, S for select, stop to exit"
    );
    String status = sc.next();
    int id;
    String name;
    while (!status.equals("stop")) {
      switch (status) {
        case "I":
        case "i":
          System.out.println("Enter id and name to insert : ");
          id = sc.nextInt();
          name = sc.next();
          stmt.execute("insert into student values(" + id + ",'" + name + "')");
          break;
        case "D":
        case "d":
          System.out.println("Enter id to delete : ");
          id = sc.nextInt();
          stmt.execute("delete from student where id=" + id);
          break;
        case "U":
        case "u":
          System.out.println("Enter id to update : ");
          id = sc.nextInt();
          System.out.println("Enter updated name where id is " + id + " : ");
          name = sc.next();
          stmt.execute("update student set name='" + name + "' where id=" + id);
          break;
        case "S":
        case "s":
          ResultSet rs = stmt.executeQuery("select * from student");
          while (rs.next()) {
            System.out.println(
              "ID : " + rs.getInt("id") + "\tName : " + rs.getString("name")
            );
          }
          break;
        default:
          break;
      }
      System.out.println(
        "I for insert, D for delete, S for select, stop to exit"
      );
      status = sc.next();
    }
    sc.close();
    con.close();
  }
}
