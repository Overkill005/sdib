import java.util.*;
public class triangle {
    public static void main(String args[])
    {
        int c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}
