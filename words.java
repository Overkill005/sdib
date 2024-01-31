import java.util.*;

public class words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String s = sc.nextLine();
        String b = "";
        s=s+" ";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                b = b + ch;
            } else {
                System.out.println(b);
                b = "";
            }
        }
        sc.close();
    }
}
