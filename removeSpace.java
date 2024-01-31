import java.util.*;

public class removeSpace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String b = "";
    int l = s.length();
    for (int i = 0; i < l; i++) {
      char ch = s.charAt(i);
      if (ch != ' ') {
        b = b + ch;
  
      }
    }
    System.out.println(b);
    sc.close();
  }
}
