import java.util.*;
public class swap2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 2 numbers :");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("a:"+a+" b:"+b);
       int temp=a;
       a=b;
       b=temp;
       System.out.println("a:"+a+" b:"+b);
       sc.close();
    }
}
