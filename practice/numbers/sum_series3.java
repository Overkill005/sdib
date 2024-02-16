import java.util.Scanner;

public class sum_series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= N; i++) {
            int fact = 1;
            for (int j = 1; j <= (i + 1); j++) {
                fact *= j;
            }
            sum += (double) i / fact;
        }

        System.out.println("Sum of the series: " + sum);

        sc.close();
    }
}
