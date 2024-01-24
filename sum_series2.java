
import java.util.*;
public class sum_series2 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        double s = 1;
        for (int i = 1; i < n; i++) {
            s = s + (Math.pow(x,i) / Math.pow(2,i));
        }
        System.out.println("Sum of series :" + s);
        sc.close();

    }
}
