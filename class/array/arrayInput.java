
import java.util.Scanner;

public class arrayInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 numbers : ");
    int arr[] = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Array element 0 : " + arr[0]);
    sc.close();
  }
}
