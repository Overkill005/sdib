
import java.util.Scanner;

public class array_evenSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int x = sc.nextInt();
    System.out.println("Enter "+x+" numbers : ");
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    int s = 0;
    for (int i = 0; i < x; i++) {
      if(i%2==0)
      s = s + arr[i];
    }
    System.out.println("Sum of even position of array elements :"+s);
    sc.close();
  }
}
