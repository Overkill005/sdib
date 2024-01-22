import java.util.Scanner;
public class triangle_rev {
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=4;j>i;j--){
                System.out.print("\t");
              
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"\t");
               
            }
            System.out.println();
        }
        sc.close();
    }
}
