import java.util.*;

public class twinPrime {
    boolean prime(int x) {
        int c = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 prime numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        twinPrime obj = new twinPrime();
        int c = 0;
        if (obj.prime(x) == true && obj.prime(y) == true) {
            for (int i = x; i <= y; i++) {
                if (obj.prime(i) == false) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.println(x + " and " + y + " are twin prime");
            } else {
                System.out.println(x + " and " + y + " are not twin prime");
            }
        } else {
            System.out.println(x + " and " + y + " are not prime");

        }
        sc.close();
    }
}