import java.util.*;
public class quadratic_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b and c :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a+"x^2 + "+b+"x + "+c);
        double r1=0, r2=0;
        r1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
        r2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
        System.out.println("Roots :"+r1+" "+r2);
    }
}
