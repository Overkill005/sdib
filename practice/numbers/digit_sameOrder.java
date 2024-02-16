import java.util.*;
public class digit_sameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        while(s>0){
            int r1=s%10;
            System.out.print(r1+"\t");
            s=s/10;
        }
        sc.close();
    
    }
}
