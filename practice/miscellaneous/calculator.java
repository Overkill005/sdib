import java.util.*;

public class calculator {

  int add(int a, int b) {
    return a + b;
  }

  int sub(int a, int b) {
    return a - b;
  }

  int mul(int a, int b) {
    return a * b;
  }

  float div(int a, int b) {
    return (float) a / b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 number operation separated by space :");
    int a = sc.nextInt();
    char c = sc.next().charAt(0);
    int b = sc.nextInt();
    calculator obj = new calculator();
    switch (c) {
      case '+':
        System.out.println("Addition :" + obj.add(a, b));
        break;
      case '-':
        System.out.println("Substration :" + obj.sub(a, b));
        break;
      case '*':
        System.out.println("Multiplication :" + obj.mul(a, b));
        break;
      case '/':
        System.out.println("Division :" + obj.div(a, b));
        break;
      default:
        System.out.println("Wrong expression");
        break;
    }
    sc.close();
  }
}
