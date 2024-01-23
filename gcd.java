import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x=Math.max(a,b);
        int gcd = 0;
        for (int i = 1; i <= x; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println("GCD :" + gcd);
    }
}
