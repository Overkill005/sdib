import java.util.Scanner;

public class insertionSort {
    void print(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
      System.out.println();
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    insertionSort obj = new insertionSort();
    System.out.println("Enter array length : ");
    int x = sc.nextInt();
    System.out.println("Enter " + x + " numbers : ");
    int a[] = new int[x];
    for (int i = 0; i < x; i++) {
      a[i] = sc.nextInt();
    }
  System.out.print("Sorted array : ");
    for (int i = 1; i < x; i++) {
      int key = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j+1] = key;
      }

    
    obj.print(a);
    sc.close();



  }
}
