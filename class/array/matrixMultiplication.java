
import java.util.Scanner;

public class matrixMultiplication {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rows of array1 : ");
    int r = sc.nextInt();
    System.out.println("Columns of array1 / Rows of array2 : ");
    int c = sc.nextInt();
    System.out.println("Columns of array2 : ");
    int c1 = sc.nextInt();
    int a[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("Enter element for a[" + i + "][" + j + "] :");
        a[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    int r1 = c;
    int b[][] = new int[r1][c1];
    int m[][] = new int[r][c1];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        System.out.print("Enter element for b[" + i + "][" + j + "] :");
        b[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        for (int k = 0; k < c1; k++) {
          m[i][k] = a[i][j] * b[j][k];
        }
      }
    }
    System.out.println("Matrix after multiplication : ");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        System.out.print(m[i][j] + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
