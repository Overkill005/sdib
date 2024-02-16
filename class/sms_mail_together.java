class sms extends Thread {
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

class mail extends Thread {
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

public class sms_mail_together {
  public static void main(String[] args) {
    sms s = new sms();
    mail m = new mail();
    s.start();
    m.start();
  }
}
