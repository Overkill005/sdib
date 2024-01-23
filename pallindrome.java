import java.util.*;
public class pallindrome{
    public static void main(String[] args) {
        int s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check pallindrome :");
        int x=sc.nextInt();
        int k=x;
        while(x>0){
            int r=x%10;
            s=s*10+r;
            x=x/10;
        }
        if(s==k){
            System.out.println(k+" is pallindrome");
        }
        else{
            System.out.println(k+" is not pallindrome");
        }
        sc.close();
    }
}