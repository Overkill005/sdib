import java.util.Scanner;

public class binarySearch {
  void print(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
      System.out.println();
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    binarySearch obj = new binarySearch();
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
    obj.print(arr);
    System.out.println("Enter element to be searched : ");
    int n = sc.nextInt();
    sc.nextLine();
    int m, lo = 0, up = x-1;
    // System.out.println(m);
    while (lo <= up) {
      m = up + lo / 2;
      if (n > arr[m]) {
        lo++;
      } else if (n < arr[m]) {
        up--;
      } else {
        System.out.println(n + " found at index " + m+" after sort");
        break;
      }

    }
    if (up < lo) {
      System.out.println(n+"  not found");
    }
    

    sc.close();
  }
}
