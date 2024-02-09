import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
  public static void main(String[] args) {
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 2 numbers : ");
      int i=sc.nextInt();
      int j=sc.nextInt();
      System.out.println("Sum : " + (i + j) + " Div : " + (i / j));
      sc.close();
    }
    catch (InputMismatchException e) {
      System.out.println("Enter a number.....\n"+e);
    }
    catch (ArithmeticException e) {
      System.out.println("Second number can't be zero...\n" + e);
    }
    
  }
}
