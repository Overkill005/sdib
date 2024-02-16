class sms implements Runnable{
  public void run() {
    for (int i = 0; i < 15; i++) {
      System.out.println("SMS.." + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}

class mail implements Runnable{
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Mail.." + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

}




public class threads_runnable {
  public static void main(String[] args) {
    sms s = new sms();
    mail m = new mail();
    Thread t1 = new Thread(s);
    Thread t2 = new Thread(m); 
    t1.start();
    t2.start();
  }
}
