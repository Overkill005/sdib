import java.util.Scanner;

public class exceptionCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbers :");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum : " + (a + b) + "\tDivision : " + (a / b));
    sc.close();
  }
}
/* Enter 2 numbers :
5
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exceptionCheck.main(exceptionCheck.java:9) */

/* Enter 2 numbers :
ten
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at exceptionCheck.main(exceptionCheck.java:7)     */    