import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0, s2 = 1;
        int s = 0;
        System.out.print("0\t1\t");
        for (int i = 1; i <= n - 2; i++) {
            s = s1 + s2;
            System.out.print(s + "\t");
            s1 = s2;
            s2 = s;
        }
    }
}
// 0 1 1 2 3 5 8