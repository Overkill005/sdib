import java.util.Scanner;
public class jaggedArray_dynamic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row size :");
    int r = sc.nextInt();
    int arr[][] = new int[r][];
    for (int i = 0; i < r; i++) {
      System.out.println("Enter col size for row " + i + " : ");
      int c = sc.nextInt();
      arr[i] = new int[c];
    }
  
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("Enter element for arr[" + i + "][" + j + "] :");
        arr[i][j] = sc.nextInt();
      }
      System.out.println();
    }
      for (int i = 0; i < r; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
