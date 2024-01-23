import java.util.*;

public class diamond_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = x - 1; j >= i; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + "\t");
            }
            System.out.println("\n");
        }
        for (int i = x-1; i >=1; i--) {
            for (int j = x; j >i; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print(k + "\t");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
