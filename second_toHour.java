import java.util.*;
public class second_toHour {
    public static void main(String[] args) {
        System.out.println("Enter time in seconds :");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(s+"sec");
        int h=0, m=0;
        if(s>=3600){
            h=h+(s/3600);
            s=s-(h*3600);
        }
         if(s>=60 && s<3600){
            m=m+(s/60);
            s=s-(m*60);
        }
        System.out.println(h+"hr "+m+"min "+s+"sec");
        sc.close();

    }
}
