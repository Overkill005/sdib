public class diamond_if {
  public static void main(String[] args) {
    int x = 11;
    for(int i=1;i<=x;i++){
      for (int j = 1; j <= x; j++) {
        if (i+j>x/2+1 && j-i==x/2+1  ) {
          System.out.print("+\t");
        } else
          System.out.print("\t");
      }
      System.out.println();
    }
  }
}
