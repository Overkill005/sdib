import java.util.*;

public class swastik {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an odd number of rows");
    int x = sc.nextInt();
    for (int i = 1; i <= x; i++) {
      for (int j = 1; j <= x; j++) {
        if ((i == 1 && j == 1) ||
            (i == 1 && j > x / 2) ||
            ((j == 1 || j == (x / 2) + 1) && (i <= (x / 2) + 1)) ||
            (i == (x / 2) + 1) ||
            (j == x || j == (x / 2) + 1) &&
                (i > x / 2)
            ||
            (i == x) &&
                ((j <= x / 2) || (j == x))) {
          System.out.print("* ");
        } else
          System.out.print("  ");
      }
      System.out.println();
    }
    sc.close();
  }
}
