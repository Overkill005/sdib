import java.util.Scanner;

public class ScannerCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = sc.next();
    System.out.println("Enter your roll no : ");
    int rollno = sc.nextInt();
    System.out.println("Enter your fees : ");
    double fee = sc.nextDouble();
    System.out.println("Name : "+name+"\tRoll no : "+rollno+"\tFees : "+fee);
  }
}
