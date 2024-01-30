interface agenda {
  void task1();
}

interface lastAgenda extends agenda {
  void task2();
}
public class extends_implements implements lastAgenda {
  public void task1() {
    System.out.println("Task1");
  }  

  public void task2() {
    System.out.println("Task2");
  }
  public static void main(String[] args) {
    extends_implements obj = new extends_implements();
    obj.task1();
    obj.task2();
    
  }
}
