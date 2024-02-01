import java.util.*;

public class strongNumber {

  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = n;
    int s = 0;

    while (n > 0) {
      int x = 1;
      int r = n % 10;

      for (int i = 1; i <= r; i++) {
        x = x * i;
      }

      s = s + x;
      n = n / 10;
    }

    if (k == s) {
      System.out.println(k + " is a strong number");
    } else {
      System.out.println(k + " is not a strong number");
    }

    sc.close();
  }
}
