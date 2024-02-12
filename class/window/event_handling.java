import javax.swing.*;
import java.awt.event.*;


public class event_handling implements ActionListener{
  JButton btn;
  JFrame jf = new JFrame();
  event_handling() {
    jf.setSize(400, 400);
    jf.setVisible(true);
    jf.setLocation(200, 100);

    btn = new JButton("Ok");
    btn.setBounds(100, 100, 150, 40);
    jf.add(btn);
    btn.addActionListener(this);

    jf.setLayout(null);
  }

  public void actionPerformed(ActionEvent e) {
    JDialog d = new JDialog();
    d.setSize(200, 200);
    d.setLocation(100, 100);
    d.setVisible(true);
  }

  public static void main(String[] args) {
    new event_handling();
  }
}
