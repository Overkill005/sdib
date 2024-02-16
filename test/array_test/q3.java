import java.util.*;

public class q3 {
  public static void main(String[] args) {
    int a[] = new int[10];
    String grade = "";
    System.out.println("Enter 10 numbers between 0 and 100 : ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < 10; i++) {
      if (a[i] >= 0 && a[i] <= 29) {
        grade = "Fail";
      } else if (a[i] >= 30 && a[i] <= 49) {
        grade = "Good";
      } else if (a[i] >= 50 && a[i] <= 69) {
        grade = "Better";
      } else if (a[i] >= 70 && a[i] <= 89) {
        grade = "Best";
      } else if (a[i] >= 90 && a[i] <= 100) {
        grade = "Excellent";
      }
      System.out.println(a[i] + "\t" + i + "\t" + grade);
    }
    sc.close();
  }
}
