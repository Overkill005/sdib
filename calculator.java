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

    int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter choice :");
        char c = sc.next().charAt(0);
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
        }
    }
}
