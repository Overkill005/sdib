import java.util.*;
public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int k=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<i;j++){
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
