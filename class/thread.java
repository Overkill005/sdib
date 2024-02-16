class Demo extends Thread {
  public void run() {   // call by JVM after callin start()
    System.out.println("Thread...");
  }
}

public class thread {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.start();
  }
}
