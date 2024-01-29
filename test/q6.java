import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int l = x.length();
        System.out.println(l);
        String s = "";
        for (int i = 0; i < l; i++) {
            s = x.charAt(i) + s;
        }
        System.out.println("Reverse string :" + s);
        sc.close();
    }
}
