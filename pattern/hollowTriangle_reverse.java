import java.util.*;

public class hollowTriangle_reverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == n || i == n || i + j - 1 == n) {
          System.out.print("9  ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
