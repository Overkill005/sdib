import java.io.Console;

public class Uid_pwd_Console {

  public static void main(String[] args) {
    Console c = System.console();
    System.out.println("Enter a user id : ");
    String uid = c.readLine();
    System.out.println("Enter a password : ");
    char pwd[] = c.readPassword();
    System.out.println(uid + " " + String.valueOf(pwd) + " m " + pwd); //char[] to String : String.valueOf(pwd)
    for (char ch : pwd) {
      System.out.print(ch);
    }
  }
}
