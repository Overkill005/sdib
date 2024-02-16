import java.util.*;

public class tribonacci {
    public static void main(String args[]) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0, s2 = 1, s3 = 2;
        int s = 0;
        System.out.print("0\t1\t2\t");
        for (int i = 1; i <= n - 3; i++) {
            s = s1 + s2 + s3;
            System.out.print(s + "\t");
            s1 = s2;
            s2 = s3;
            s3 = s;
        }
        sc.close();

    }
}