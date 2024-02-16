import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int m = Math.max(num1, num2);
        int l = m;

        while (true) {
            if (l % num1 == 0 && l % num2 == 0) {
                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + l);
                break;
            }
            l += m;
        }

        sc.close();
    }
}
