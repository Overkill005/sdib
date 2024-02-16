import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] a = new String[3][5];

        System.out.println("Enter values for the 2D array (3 rows, 5 columns):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.next();
            }
        }

        int d = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                String c = a[i][j];
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {
                        if ((i != x || j != y) && c.equals(a[x][y])) {
                            System.out.println("Duplicate value '" + c + "' at (" + i + "," + j + ") and (" + x
                                    + "," + y + ")");
                            d = 1;
                        }
                    }
                }
            }
        }

        if (d==0) {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}