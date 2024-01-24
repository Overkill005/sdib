import java.util.*;
public class coPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=0;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0){
                c++;
            }
        }
        if(c==1){
            System.out.println(x+" and "+y+" are co-prime");
        }
        else{
            System.out.println(x+" and "+y+" are not co-prime");    
        }
        sc.close();
    }
}
