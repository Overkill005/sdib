import java.util.Scanner;

class dynamic_2Darray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rows of array : ");
    int r = sc.nextInt();
    System.out.println("Columns of array : ");
    int c = sc.nextInt();
    int a[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("Enter element for a[" + i + "][" + j + "] :");
        a[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
