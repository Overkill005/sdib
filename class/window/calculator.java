import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {

  JTextField lbl, expr;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, mod, del, eq, c, dot;
  String display = "";
  double num1 = 0, num2 = 0, result = 0;
  char operator;

  calculator() {
    
    this.setSize(290, 500);
    this.setLocation(200, 100);
    this.getContentPane().setBackground(Color.BLACK);
    this.setLayout(null);
    // this.setBackground(Color.BLACK);
    // this.setVisible(true);

    lbl = new JTextField();
    lbl.setBounds(20, 10, 230, 80);
    lbl.setFont(new Font("Arial", Font.PLAIN, 20));
    lbl.setVisible(false);
    lbl.setEditable(false);
    this.add(lbl);

    expr = new JTextField();
    expr.setBounds(20, 10, 230, 80);
    expr.setFont(new Font("Arial", Font.PLAIN, 20));
    expr.setBackground(Color.decode("#262626")); //#dedede
    expr.setForeground(Color.decode("#ebedeb"));
    expr.setEditable(false);
    expr.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // use Color.decode for using hash colors
    // expr.setEditable(false);
    this.add(expr);

    c = new JButton("C");
    c.setBounds(20, 100, 54, 65);
    c.setFont(new Font("Arial", Font.PLAIN, 20));
    c.setMargin(new Insets(1, 1, 1, 1));
    c.addActionListener(this);
    this.add(c);

    del = new JButton("DEL");
    del.setFont(new Font("Arial", Font.PLAIN, 20));
    del.setMargin(new Insets(1, 1, 1, 1));
    del.setBounds(79, 100, 54, 65);
    del.addActionListener(this);
    this.add(del);

    mod = new JButton("%");
    mod.setFont(new Font("Arial", Font.PLAIN, 20));
    mod.setMargin(new Insets(1, 1, 1, 1));
    mod.setBounds(138, 100, 54, 65);
    mod.addActionListener(this);
    this.add(mod);

    div = new JButton("/");
    div.setFont(new Font("Arial", Font.PLAIN, 20));
    div.setMargin(new Insets(1, 1, 1, 1));
    div.setBounds(196, 100, 54, 65);
    div.addActionListener(this);
    this.add(div);

    add = new JButton("+");
    add.setFont(new Font("Arial", Font.PLAIN, 20));
    add.setMargin(new Insets(1, 1, 1, 1));
    add.setBounds(196, 310, 54, 65);
    add.addActionListener(this);
    this.add(add);

    sub = new JButton("-");
    sub.setFont(new Font("Arial", Font.PLAIN, 20));
    sub.setMargin(new Insets(1, 1, 1, 1));
    sub.setBounds(196, 240, 54, 65);
    sub.addActionListener(this);
    this.add(sub);

    mul = new JButton("x");
    mul.setFont(new Font("Arial", Font.PLAIN, 20));
    mul.setMargin(new Insets(1, 1, 1, 1));
    mul.setBounds(196, 170, 54, 65);
    mul.addActionListener(this);
    this.add(mul);

    b9 = new JButton("9");
    b9.setBounds(20, 170, 54, 65);
    b9.setFont(new Font("Arial", Font.PLAIN, 20));
    b9.setMargin(new Insets(1, 1, 1, 1));
    b9.addActionListener(this);
    this.add(b9);

    b8 = new JButton("8");
    b8.setFont(new Font("Arial", Font.PLAIN, 20));
    b8.setMargin(new Insets(1, 1, 1, 1));
    b8.setBounds(79, 170, 54, 65);
    b8.addActionListener(this);
    this.add(b8);

    b7 = new JButton("7");
    b7.setFont(new Font("Arial", Font.PLAIN, 20));
    b7.setMargin(new Insets(1, 1, 1, 1));
    b7.setBounds(138, 170, 54, 65);
    b7.addActionListener(this);
    this.add(b7);

    b6 = new JButton("6");
    b6.setFont(new Font("Arial", Font.PLAIN, 20));
    b6.setMargin(new Insets(1, 1, 1, 1));
    b6.setBounds(20, 240, 54, 65);
    b6.addActionListener(this);
    this.add(b6);

    b5 = new JButton("5");
    b5.setFont(new Font("Arial", Font.PLAIN, 20));
    b5.setMargin(new Insets(1, 1, 1, 1));
    b5.setBounds(79, 240, 54, 65);
    b5.addActionListener(this);
    this.add(b5);

    b4 = new JButton("4");
    b4.setFont(new Font("Arial", Font.PLAIN, 20));
    b4.setMargin(new Insets(1, 1, 1, 1));
    b4.setBounds(138, 240, 54, 65);
    b4.addActionListener(this);
    this.add(b4);
    b3 = new JButton("3");
    b3.setFont(new Font("Arial", Font.PLAIN, 20));
    b3.setMargin(new Insets(1, 1, 1, 1));
    b3.setBounds(20, 310, 54, 65);
    b3.addActionListener(this);
    this.add(b3);

    b2 = new JButton("2");
    b2.setFont(new Font("Arial", Font.PLAIN, 20));
    b2.setMargin(new Insets(1, 1, 1, 1));
    b2.setBounds(79, 310, 54, 65);
    b2.addActionListener(this);
    this.add(b2);

    b1 = new JButton("1");
    b1.setFont(new Font("Arial", Font.PLAIN, 20));
    b1.setMargin(new Insets(1, 1, 1, 1));
    b1.setBounds(138, 310, 54, 65);
    b1.addActionListener(this);
    this.add(b1);

    b0 = new JButton("0");
    b0.setFont(new Font("Arial", Font.PLAIN, 20));
    b0.setMargin(new Insets(1, 1, 1, 1));
    b0.setBounds(79, 380, 113, 65);
    b0.addActionListener(this);
    this.add(b0);
    dot = new JButton(".");
    dot.setFont(new Font("Arial", Font.PLAIN, 20));
    dot.setMargin(new Insets(1, 1, 1, 1));
    dot.setBounds(20, 380, 54, 65);
    dot.addActionListener(this);
    this.add(dot);

    eq = new JButton("=");
    eq.setFont(new Font("Arial", Font.PLAIN, 20));
    eq.setMargin(new Insets(1, 1, 1, 1));
    eq.setBounds(196, 380, 54, 65);
    eq.addActionListener(this);
    this.add(eq);

    this.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == c) {
      display = "";
      num1 = 0;
      num2 = 0;
      result = 0;
      expr.setVisible(true);
      lbl.setVisible(false);
      expr.setText("");
      lbl.setText("");
    } else if (e.getSource() == del) {
      if (!display.isEmpty()) {
        display = display.substring(0, display.length() - 1);
        expr.setText(display);
      }
    } else if (
      e.getSource() == add ||
      e.getSource() == sub ||
      e.getSource() == mul ||
      e.getSource() == div ||
      e.getSource() == mod
    ) {
      if (!display.isEmpty()) {
        display += " " + ((JButton) e.getSource()).getText() + " ";
        expr.setText(display);
        lbl.setText(display);
        if (
          lbl.isVisible() == true &&
          (
            e.getSource() == add ||
            e.getSource() == sub ||
            e.getSource() == mul ||
            e.getSource() == div ||
            e.getSource() == mod
          )
        ) {
          String out = "";
          char newop = ((JButton) e.getSource()).getText().charAt(0);
          out = out + num1 + newop;
          expr.setText(out);
          expr.setVisible(true);
          lbl.setVisible(false);
        }
      } else {
        display = ((JButton) e.getSource()).getText();
        // lbl.setText(display);
      }
      operator = ((JButton) e.getSource()).getText().charAt(0);
    } else if (e.getSource() == eq) {
      num2 =
        Double.parseDouble(display.substring(display.lastIndexOf(" ") + 1));
      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case 'x':
          result = num1 * num2;
          break;
        case '/':
          if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
            return;
          }
          result = num1 / num2;
          break;
        case '%':
          result = num1 % num2;
          break;
      }
      display = num1 + " " + operator + " " + num2 + " = " + result;
      expr.setText("");
      expr.setVisible(false);
      lbl.setText(display);
      lbl.setVisible(true);
      num1 = result;
      num2 = 0;
      result = 0;
    } else {
      display += ((JButton) e.getSource()).getText();
      expr.setText(expr.getText() + display.substring(display.length() - 1));
      num1 = Double.parseDouble(display);
      lbl.setText(display);
    }
  }

  public static void main(String[] args) {
    new calculator();
  }
}
