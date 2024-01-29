import java.util.*;

public class q9 {
    int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        q9 obj = new q9();
        System.out.println("Factorial of " + x + " is " + obj.fact(x));
        sc.close();
    }
}
