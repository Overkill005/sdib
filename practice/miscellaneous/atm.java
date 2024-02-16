import java.util.*;

public class atm {

  public static void main(String[] args) {
    float b = 5496.45f;
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Deposit\n2. Withdraw\nEnter choice : ");
    int c = sc.nextInt();
    switch (c) {
      case 1:
        System.out.println("Enter amount to be deposited : ");
        float x = sc.nextFloat();
        b = b + x;
        System.out.println("Remaining balance : " + b);
        break;
      case 2:
        System.out.println("Enter amount to be withdrawn : ");
        float x1 = sc.nextFloat();
        b = b - x1;
        System.out.println("Remaining balance : " + b);
        break;
      default:
        System.out.println("Current balance : " + b);
        break;
    }
    sc.close();
  }
}
