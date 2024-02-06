public class twoD_array {
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
    arr[0][0] = 10;
    arr[1][1] = 20;
    arr[2][1] = 70;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j]+"\t");

      }
      System.out.println();
    }
  }
}