import java.util.*;

public class compoundInterest {
    double ci(double p, double r, double n) {
      
     double c = p * Math.pow(1.0 + r / 100.0, n) - p;

        return c;
    }

    public static void main(String[] args) {
        compoundInterest obj = new compoundInterest();
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double n = sc.nextDouble();
        double ci = obj.ci(p, r, n);
        System.out.println("Compund interest: " + ci);
        sc.close();
    }
}
