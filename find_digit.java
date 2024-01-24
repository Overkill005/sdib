import java.util.Scanner;

public class find_digit {
    public static void main(String[] args) {
        int r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Enter digit to be searched :");
        int x = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            if (r == x) {
                System.out.println(x + " found");
            }

            n = n / 10;
        }
        if (r != x) {
            System.out.println(x + " not found");
        }
        sc.close();
    }
}
