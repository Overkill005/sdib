import java.util.*;

public class prime {
    public static void main(String[] args) {
        int c = 0;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");

    }
}
