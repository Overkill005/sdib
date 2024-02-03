import java.util.*;
public class sum_plus_minus {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0, k=1;
        for (int i = 1; i <= n*2; i+=2) {
            s = s + (1 / (double) (i*k));
            k=k*-1;
        }
        System.out.println("Sum of series :" + s);
        sc.close();

    }
}
