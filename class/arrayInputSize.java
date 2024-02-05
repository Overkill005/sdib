
import java.util.Scanner;

public class arrayInputSize {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int x = sc.nextInt();
    System.out.println("Enter "+x+" numbers : ");
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Elements are : ");
      for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
