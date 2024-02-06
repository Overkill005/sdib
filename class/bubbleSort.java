import java.util.Scanner;

public class bubbleSort {

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
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  System.out.print("Sorted array : ");
    
    for (int i = 0; i < x; i++) {
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
    sc.close();
  }
}
