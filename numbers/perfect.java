import java.util.*;

public class perfect {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int s = 0, m = 1;
        for (int i = 1; i < r; i++) {
            if (r % i == 0) {
                s = s + i;
                m = m * i;
                // System.out.println(i + "" + m + " " + s);
            }
        }

        if (m == s) {
            System.out.println(r + " is perfect number");
        } else {
            System.out.println(r + " is not perfect number");
        }
        sc.close();
    }
}