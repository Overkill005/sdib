public class diagonalArrow1 {
  public static void main(String[] args) {
    int n = 7;
    for (int i = 1; i <=n; i++) {
      for (int j = n; j > i; j--) {
        if (i + j - 1 == n) {
          System.out.print("+ ");
        } else {
          System.out.print("  ");
        }
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("+ ");
      }
      
    System.out.println();
    }
  }
}
