import java.util.Scanner;

public class star {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i - 1 == n / 2 || j - 1 == n / 2 || i == j || i + j - 1 == n)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    sc.close();
  }
}

