import java.util.*;   // 9   ---->  9^2=81    ----> 8+=9

public class neonNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int sq= n*n;
        while(sq>0){
            int r=sq%10;
            s=s+r;
            sq=sq/10;
            
        }
        if(s==n){
            System.out.println(n+" is neon number");
        }
        else{
            System.out.println(n+" is not neon number");
        }
        sc.close();

    }
}