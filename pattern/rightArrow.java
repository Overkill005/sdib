import java.util.*;

public class rightArrow {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int x = sc.nextInt();
    for (int i = 1; i <= x / 2; i++) {
      for (int j = 1; j <= x / 2; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <=i; k++) {
        System.out.print("+ ");
      }
      System.out.println();
    }
    for (int i = 1; i <= x; i++) {
      System.out.print("+ ");
    }
    System.out.println();
    for (int i = 1; i <= x / 2; i++) {
      for (int j = 1; j <= x / 2; j++) {
        System.out.print("  ");
      }
      for (int k = x / 2; k >= i; k--) {
        System.out.print("+ ");
      }
      System.out.println();
    }
    sc.close();
  }
}
