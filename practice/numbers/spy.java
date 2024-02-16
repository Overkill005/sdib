import java.util.*; //1124 --->1+1+2+4=1*1*2*4

public class spy {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = 0, m = 1;
        int k=n;
        while (n > 0) {
            int r = n % 10;

            s = s + r;
            m = m * r;
            n = n / 10;
        }

        if (m == s) {
            System.out.println(k + " is spy number");
        } else {
            System.out.println(k + " is not spy number");
        }
        sc.close();
    }
}