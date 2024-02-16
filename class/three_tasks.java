class task1 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task1\t" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}

class task2 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task2\t" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}
class task3 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Task3\t" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}

public class three_tasks {
  public static void main(String[] args) {
    task1 t1 = new task1();
    task2 t2 = new task2();
    task3 t3 = new task3();
    t1.start();
    t2.start();
    t3.start();
  }
}
