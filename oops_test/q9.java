class bankA {

  int deposit = 1000;
}

class bankB {

  int deposit = 1500;
}

class bankC {

  int deposit = 2000;
}

public class q9 {

  public static void main(String[] args) {
    bankA a = new bankA();
    bankB b = new bankB();
    bankC c = new bankC();
    System.out.println("Deposited in A : "+a.deposit);
    System.out.println("Deposited in B : "+b.deposit);
    System.out.println("Deposited in C : "+c.deposit);
  }
}
