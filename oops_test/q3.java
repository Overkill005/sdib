import java.util.Scanner;
class AddAmount { //3

  int amount = 50;
  int add;

  AddAmount() {
    add = 0;
  }

  AddAmount(int n) {
    add = n;
    amount = amount + n;
  }
}

public class q3 {

  public static void main(String[] args) {
    AddAmount obj1 = new AddAmount();
    System.out.println("Amount : " + obj1.amount);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an amount : ");
    int n = sc.nextInt();
    AddAmount obj2 = new AddAmount(n);
    System.out.println("Amount : " + obj2.amount);
    sc.close();
  }
}
