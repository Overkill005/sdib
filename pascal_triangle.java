import java.util.*;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num-i; j++) {
                System.out.print("\t");
            }
            int C = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(C + "\t\t");
                C = C * (i - k) / k;
            }
            System.out.println();
        }
    
        sc.close();
    }
}
