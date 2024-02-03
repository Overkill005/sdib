import java.util.*;
public class automorphic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    String ns = Integer.toString(n);
    int sq = n * n;
    String ss = Integer.toString(sq);
    int l = ns.length();
    int ls = ss.length();
    if (ns.equals(ss.substring(ls - l))) {
      System.out.println(n+" is automorphic");
    }
    else {
      System.out.println(n + " is not automorphic");
    }
    sc.close();
  }
}
