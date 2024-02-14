import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] a = new String[3][5];
        System.out.println("Enter values for the 2D array (3 rows, 5 columns):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.next();
            }
        }
        System.out.println("Values with even sum of row index and column index:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println(a[i][j]);
                }
            }
        }
        sc.close();
    }
}