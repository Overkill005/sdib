// import java.util.Arrays;
import java.util.Scanner;

public class second_Smallest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int x = sc.nextInt();
    System.out.println("Enter " + x + " numbers : ");
    int arr[] = new int[x];
    int temp = 0;
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < x; i++) {
      for (int j = i + 1; j < x; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Second smallest number : " + arr[1]);
    sc.close();
  }
}
