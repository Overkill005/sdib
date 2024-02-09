
import java.util.Scanner;

public class selectionSort {

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
      for (int j = i + 1; j < x; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
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

