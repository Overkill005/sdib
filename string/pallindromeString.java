import java.util.*;

public class pallindromeString {

  String reverse(String s) {
    int l = s.length();
    String b = "";
    for (int i = 0; i < l; i++) {
      char ch = s.charAt(i);
      b = ch + b;
    }
    return b;
  }

  public static void main(String[] args) {
    reverseString obj = new reverseString();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string :");
    String s = sc.next();
    String b = obj.reverse(s);
    if (s.equals(b)) System.out.println(
      s + " is pallindrome string"
    ); else System.out.println(s + " is not pallindrome string");
    sc.close();
  }
}
