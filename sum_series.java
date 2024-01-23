import java.util.*;

public class sum_series {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s = s + (1 / (double) i);
        }
        System.out.println("Sum of series :" + s);
    }
}
