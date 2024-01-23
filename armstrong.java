
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s + (r * r * r);
            n = n / 10;
        }
        if (k == s) {
            System.out.println(k + " is armstrong number");
        } else {
            System.out.println(k + " is not armstrong number");
        }
        sc.close();
    }
}