import java.awt.event.*;
import javax.swing.*;

public class add_two extends JFrame implements ActionListener {

  JTextField tfno, tsno;
  JLabel lbl;
  JButton btn;

  public void actionPerformed(ActionEvent e) {
    int i = Integer.parseInt(tsno.getText());
    int j = Integer.parseInt(tfno.getText());
    int r = i + j;
    lbl.setText(String.valueOf(r));
  }

  add_two() {
    this.setSize(400, 400);
    this.setLocation(200, 100);
    
    tsno = new JTextField();
    tsno.setBounds(100, 100, 200, 40);
    this.add(tsno);
    
    tfno = new JTextField();
    tfno.setBounds(100, 50, 200, 40);
    this.add(tfno);
    
    btn = new JButton("ADD");
    btn.setBounds(100, 150, 200, 40);
    this.add(btn);
    btn.addActionListener(this);
    
    lbl = new JLabel();
    lbl.setBounds(100, 200, 200, 40);
    this.add(lbl);
    
    this.setVisible(true);
    this.setLayout(null);
  }

  public static void main(String[] args) {
    new add_two();
  }
}
