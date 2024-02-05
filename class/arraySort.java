import java.util.Scanner;

public class arraySort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int x = sc.nextInt();
    System.out.println("Enter " + x + " numbers : ");
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    int temp = 0;
    for (int j = 0; j < x; j++) {
      for (int i = 1; i < x; i++) {
        if (arr[i - 1] > arr[i]) {
          temp = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = temp;
        }
      }
    }
    for (int i = 0; i < x; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
