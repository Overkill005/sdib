public class forloop {
    public static void main(String ags[]){
        System.out.println("Enter a number :");
        int n=new java.util.Scanner(System.in).nextInt();
        int r=1;
        for(int i=1;i<=n;i++)
        {
            r=r*i;
            System.out.println(r);
        }
    }
    
}
