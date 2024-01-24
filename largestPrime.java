
import java.util.Scanner;

public class largestPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 1; i--) {
            int c=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
                if(c==2){
                    System.out.println("Largest prime :"+i);
                    break;
            }
        }
        sc.close();

    }
}
