import java.util.*;

public class patternArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= (n / 2) - 1; i++) {
            for (int k = (n / 2) - 1; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n / 2; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = (n / 2) - 1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
