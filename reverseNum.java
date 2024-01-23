import java.util.*;
public class reverseNum {
    public static void main(String args[]) {
        int s=0;
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x>0){
            int r=x%10;
            s=s*10+r;
            x=x/10;
        }
        System.out.println("Reverse number: "+s);
        sc.close();
    }    
}
