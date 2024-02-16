import java.util.*;
public class q2 {
  public static void main(String[] args) {
    double a[] = new double[10];
    int c = 0;
    double cd = 0.0;
    System.out.println("Enter 10 numbers :");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      a[i] = sc.nextDouble();
    }
    for (int i = 0; i < 10; i++) {
      if (Math.ceil(a[i]) - a[i] == 0) {
        if (a[i] > c) {
          c = (int) a[i];
        }
      } else {
        if (a[i] > cd) {
          cd = a[i];
        }
      }
    }
    System.out.println("Largest integer value : "+c);
    System.out.println("Largest fractional value : " + cd);
    sc.close();
  }
}
