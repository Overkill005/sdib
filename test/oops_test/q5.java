class Print { //5
  void printBoth(int i, char c) {
    System.out.println("Integer : " + i);
  }

  void printBoth(char c, int i) {
    System.out.println("Character : " + c);
  }
}

public class q5 {
    public static void main(String[] args) {
    Print obj = new Print();
    obj.printBoth(3, 'u');
    obj.printBoth('u', 3);
  }
}
