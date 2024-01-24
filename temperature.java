import java.util.*;
public class temperature {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius : ");
        double c=sc.nextDouble();
        System.out.println("Temperature in celcius :"+c+"°C");
        double f=(9/5)*c+32;
        System.out.println("Temperature in fahrenheit :"+f+"°F");
        sc.close();

    }
}
