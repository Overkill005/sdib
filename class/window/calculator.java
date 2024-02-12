// import java.awt.font.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {

  // JTextField tfno, tsno;
  JTextField lbl;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, mod, del, eq, c;
  String display = "";

  calculator() {
    this.setSize(290, 500);
    this.setLocation(200, 100);
    this.setVisible(true);
    // this.getContentPane().setBackground(Color.WHITE);

    lbl = new JTextField();
    lbl.setBounds(100, 40, 200, 100);
    this.add(lbl);
    c = new JButton("C");
    c.setBounds(20, 100, 50, 60);
    c.setFont(new Font("Arial", Font.PLAIN, 20));
    c.setMargin(new Insets(1, 1, 1, 1));
    c.addActionListener(this);
    this.add(c);
    del = new JButton("DEL");
    del.setFont(new Font("Arial", Font.PLAIN, 20));
    del.setMargin(new Insets(1, 1, 1, 1));
    del.setBounds(80, 100, 50, 60);
    del.addActionListener(this);
    this.add(del);
    mod = new JButton("%");
    mod.setFont(new Font("Arial", Font.PLAIN, 20));
    mod.setMargin(new Insets(1, 1, 1, 1));
    mod.setBounds(140, 100, 50, 60);
    mod.addActionListener(this);
    this.add(mod);
    div = new JButton("/");
    div.setFont(new Font("Arial", Font.PLAIN, 20));
    div.setMargin(new Insets(1, 1, 1, 1));
    div.setBounds(200, 100, 50, 60);
    div.addActionListener(this);
    this.add(div);
    add = new JButton("+");
    add.setFont(new Font("Arial", Font.PLAIN, 20));
    add.setMargin(new Insets(1, 1, 1, 1));
    add.setBounds(200, 310, 50, 60);
    add.addActionListener(this);
    this.add(add);
    sub = new JButton("-");
    sub.setFont(new Font("Arial", Font.PLAIN, 20));
    sub.setMargin(new Insets(1, 1, 1, 1));
    sub.setBounds(200, 240, 50, 60);
    sub.addActionListener(this);
    this.add(sub);
    mul = new JButton("x");
    mul.setFont(new Font("Arial", Font.PLAIN, 20));
    mul.setMargin(new Insets(1, 1, 1, 1));
    mul.setBounds(200, 170, 50, 60);
    mul.addActionListener(this);
    this.add(mul);
    b9 = new JButton("9");
    b9.setBounds(20, 170, 50, 60);
    b9.setFont(new Font("Arial", Font.PLAIN, 20));
    b9.setMargin(new Insets(1, 1, 1, 1));
    b9.addActionListener(this);
    this.add(b9);
    b8 = new JButton("8");
    b8.setFont(new Font("Arial", Font.PLAIN, 20));
    b8.setMargin(new Insets(1, 1, 1, 1));
    b8.setBounds(80, 170, 50, 60);
    b8.addActionListener(this);
    this.add(b8);
    b7 = new JButton("7");
    b7.setFont(new Font("Arial", Font.PLAIN, 20));
    b7.setMargin(new Insets(1, 1, 1, 1));
    b7.setBounds(140, 170, 50, 60);
    b7.addActionListener(this);
    this.add(b7);
    b6 = new JButton("6");
    b6.setFont(new Font("Arial", Font.PLAIN, 20));
    b6.setMargin(new Insets(1, 1, 1, 1));
    b6.setBounds(20, 240, 50, 60);
    b6.addActionListener(this);
    this.add(b6);
    b5 = new JButton("5");
    b5.setFont(new Font("Arial", Font.PLAIN, 20));
    b5.setMargin(new Insets(1, 1, 1, 1));
    b5.setBounds(80, 240, 50, 60);
    b5.addActionListener(this);
    this.add(b5);
    b4 = new JButton("4");
    b4.setFont(new Font("Arial", Font.PLAIN, 20));
    b4.setMargin(new Insets(1, 1, 1, 1));
    b4.setBounds(140, 240, 50, 60);
    b4.addActionListener(this);
    this.add(b4);

    b3 = new JButton("3");
    b3.setFont(new Font("Arial", Font.PLAIN, 20));
    b3.setMargin(new Insets(1, 1, 1, 1));
    b3.setBounds(20, 310, 50, 60);
    b3.addActionListener(this);
    this.add(b3);
    b2 = new JButton("2");
    b2.setFont(new Font("Arial", Font.PLAIN, 20));
    b2.setMargin(new Insets(1, 1, 1, 1));
    b2.setBounds(80, 310, 50, 60);
    b2.addActionListener(this);
    this.add(b2);
    b1 = new JButton("1");
    b1.setFont(new Font("Arial", Font.PLAIN, 20));
    b1.setMargin(new Insets(1, 1, 1, 1));
    b1.setBounds(140, 310, 50, 60);
    b1.addActionListener(this);
    this.add(b1);
    b0 = new JButton("0");
    b0.setFont(new Font("Arial", Font.PLAIN, 20));
    b0.setMargin(new Insets(1, 1, 1, 1));
    b0.setBounds(80, 380, 50, 60);
    b0.addActionListener(this);
    this.add(b0);
    eq = new JButton("=");
    eq.setFont(new Font("Arial", Font.PLAIN, 20));
    eq.setMargin(new Insets(1, 1, 1, 1));
    eq.setBounds(200, 380, 50, 60);
    eq.addActionListener(this);
    this.add(eq);

    this.setLayout(null);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == c) {
      display = "";
    } else if (e.getSource() == del) {
      if (display.length() > 0) {
        display = display.substring(0, display.length() - 1);
      }
    } else {
      display += ((JButton) e.getSource()).getText();
    }
    lbl.setText(display);
  }

  public static void main(String[] args) {
    new calculator();
  }
}
