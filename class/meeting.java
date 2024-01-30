abstract class agenda {

  abstract void task1();

  void task2() {
    System.out.println("Inside task2 of abstract");
  }
}

public class meeting extends agenda {

  void task1() {
    System.out.println("Inside task1 of sub-class");
  }

  public static void main(String[] args) {
    meeting obj = new meeting();
    obj.task1();
    obj.task2();
  }
}
