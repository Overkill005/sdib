class sms {
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

class mail {
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

public class sms_mail {
  public static void main(String[] args) {
    sms s = new sms();
    s.run();
    mail m = new mail();
    m.run();
  }
}
