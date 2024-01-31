import java.util.*;

public class power_recursion {

  double p;

  double pow(int x, int y) {
    if (y >= 1) {
      return x * pow(x, y - 1);
    } else return 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base and power :");
    int x = sc.nextInt();
    int y = sc.nextInt();
    power_recursion obj = new power_recursion();
    System.out.println(obj.pow(x, y));
    sc.close();
  }
}
