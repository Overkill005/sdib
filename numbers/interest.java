import java.util.*;
public class interest {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal :");
        int p=sc.nextInt();
        System.out.println("Enter rate :");
        int r=sc.nextInt();
        System.out.println("Enter time :");
        int t=sc.nextInt();
        double i=(p*r*t)/100;
        System.out.println("Simple interest:"+i);
        sc.close();

        
    }
    
}
