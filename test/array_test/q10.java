public class q10 {
  public static void main(String[] args) {
    int s = 0, max = Integer.MIN_VALUE, start = 0, end = 0;
    int a[] = { -2,-1,-6,-8,-7};
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        for (int k = i; k <j; k++) {
          s = s + a[k];
          if (s > max) {
            max = s;
            start = i;
            end = j-1;
          }
        }
        s = 0;
      }
    }
    System.out.println("Max subarray sum is " + max + " starting with index " + start + " and ending with " + end);
  }
}
