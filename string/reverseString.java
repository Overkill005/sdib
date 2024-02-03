import java.util.*;

public class reverseString {
    String reverse(String s) {
        int l = s.length();
        String b = "";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            b = ch + b;
        }
        return b;
    }

    public static void main(String[] args) {
        reverseString obj=new reverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.next();
        String b = obj.reverse(s);
        System.out.println("Reversed string : " + b);
        sc.close();
    }
}
