import java.util.*;

public class countWords {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence :");
    String s = sc.nextLine();
    int c = 0;
    s = s + " ";
    int l = s.length();
    for (int i = 0; i < l; i++) {
      char ch = s.charAt(i);
      if (ch == ' ') {
        c++;

      }
    }
      System.out.println("Number of words :" + c);
      sc.close();
  }
}
