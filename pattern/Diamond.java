import java.util.*;
public class Diamond {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=x;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        for(int i=1;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=x;k>i;k--){
                System.out.print("*   ");
            }
            System.out.println();
        }
        sc.close();
    }
}
