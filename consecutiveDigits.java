import java.util.*;

public class consecutiveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        int k = x;
        int temp = 0, c = 0;
        while (x > 0) {
            int r = x % 10;
            if (temp == r) {
                System.out.println(k + " has consecutive digits");
                c = 1;
            }
            temp = r;
            x = x / 10;

        }
        if (c == 0) {
            System.out.println(k + " does not have consecutive digits");
        }
    }
}
