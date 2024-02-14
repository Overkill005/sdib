import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] s = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter roll number: ");
            s[i][0] = sc.nextInt();

            int t = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Enter marks for subject " + j + ": ");
                s[i][j] = sc.nextInt();
                t += s[i][j];
            }
            s[i][4] = t; 
            s[i][5] = t / 3; 
        }

    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (s[j][5] < s[j + 1][5]) {
                    int[] temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        System.out.println("\nStudent details sorted by average marks  in descending order :");
        System.out.println("Roll Number\tTotal Marks\tAverage Marks");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i][0] + "\t\t" + s[i][4] + "\t\t" + s[i][5]);
        }

        sc.close();
    }
}