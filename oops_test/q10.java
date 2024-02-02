class Bank {
  int getBalance() {
    return 0;
  }
}
class BankA extends Bank {
  int getBalance(int b) {
    return b;
  }
}
class BankB extends Bank {
  int getBalance(int b) {
    return b;
  }
}
class BankC {
  int getBalance(int b) {
    return b;
  }
}
public class q10 {
  public static void main(String[] args) {
    BankA a = new BankA();
    BankB b = new BankB();
    BankC c = new BankC();
    System.out.println("Balance of Bank A : "+a.getBalance(15000));
    System.out.println("Balance of Bank B : "+b.getBalance(50000));
    System.out.println("Balance of Bank C : "+c.getBalance(25000));
  }
}
