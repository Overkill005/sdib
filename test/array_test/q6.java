import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
    
        String[][] emp = new String[10][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Employee ID: ");
            emp[i][0] = sc.nextLine();
            System.out.print("Employee Name: ");
            emp[i][1] = sc.nextLine();
            System.out.print("City: ");
            emp[i][2] = sc.nextLine();
        }

        System.out.print("Enter a city name: ");
        String c = sc.nextLine();
        int i=0;
        System.out.println("Employees residing in " + c + ":");
        for (String[] e : emp) {
            if (e[2].equalsIgnoreCase(c)) {
                System.out.println(e[1]); 
                i=1;
            }
        }

        if (i==0) {
            System.out.println("No one present");
        }

        sc.close();
    }
}