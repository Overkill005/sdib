abstract class agenda {

  abstract void task();
}

public class abstractClass extends agenda {

  void task() {
    System.out.println("Task done");
  }

  public static void main(String[] args) {
    abstractClass obj = new abstractClass();
    obj.task();
  }
}
