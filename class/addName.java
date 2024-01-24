import java.util.*;

public class addName {
    String add(String fname, String lname) {
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st name :");
        String a = sc.next();
        System.out.println("Enter last name :");
        String b = sc.next();
        addName obj = new addName();
        String full = obj.add(a, b);
        System.out.println("Full name :" + full);
        sc.close();
    }

}
