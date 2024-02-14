import java.util.*;

public class q4 {
  public static void main(String[] args) {
    int a[] = new int[20];
    int se = 0, so = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 20 numbers :");
    for (int i = 0; i < 20; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < 20; i++) {
      if (a[i] % 2 == 0) {
        se = se + a[i];
        if (i < 18) {
          System.out.print(a[i] + " + ");
        } else {
          System.out.print(a[i]);
        }
      } 
    }
    System.out.println(" = " + se);
  for (int i = 0; i < 20; i++) {
      if (a[i] % 2 != 0) {
        so = so + a[i];
        if (i < 18) {
          System.out.print(a[i] + " + ");
        } else {
          System.out.print(a[i]);
        }
      }
    }
    System.out.println(" = " + so);
    sc.close();
  }
}