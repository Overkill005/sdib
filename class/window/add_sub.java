import java.awt.event.*;
import javax.swing.*;

public class add_sub extends JFrame implements ActionListener {

  JTextField tfno, tsno;
  JLabel lbl;
  JButton btn1, btn2;

  public void actionPerformed(ActionEvent e) {
    int i = Integer.parseInt(tsno.getText());
    int j = Integer.parseInt(tfno.getText());
    int r = 0;
    if (e.getSource() == btn1) {
      r = i + j;
    }
    if (e.getSource() == btn2) {
      r = i - j;
    }
    lbl.setText(String.valueOf(r));
  }

  add_sub() {
    this.setSize(400, 400);
    this.setLocation(200, 100);
    
    tsno = new JTextField();
    tsno.setBounds(100, 50, 200, 40);
    this.add(tsno);
    
    tfno = new JTextField();
    tfno.setBounds(100, 100, 200, 40);
    this.add(tfno);
    
    btn1 = new JButton("ADD");
    btn1.setBounds(100, 150, 90, 40);
    this.add(btn1);
    btn1.addActionListener(this);
    
    btn2 = new JButton("SUB");
    btn2.setBounds(210, 150, 90, 40);
    this.add(btn2);
    btn2.addActionListener(this);
    
    lbl = new JLabel();
    lbl.setBounds(100, 200, 150, 40);
    this.add(lbl);
    
    this.setVisible(true);
    this.setLayout(null);
  }

  public static void main(String[] args) {
    new add_sub();
  }
}
