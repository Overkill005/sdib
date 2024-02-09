
import java.util.Scanner;

public class voteCheck {
  static void validate(int a) {
    if (a < 18) {
      throw new ArithmeticException("Not eligible to vote...");
    }
  }
  public static void main(String[] args) {
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a age : ");
      int a=sc.nextInt();
      validate(a);
      System.out.println("Eligible to vote...");
      sc.close();
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
