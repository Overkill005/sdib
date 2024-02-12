import javax.swing.*;

public class jbutton extends JFrame {

  JButton btn;

  jbutton() {
    this.setSize(400, 400);
    this.setVisible(true);
    this.setLocation(200, 100);

    btn = new JButton("OK");
    btn.setBounds(100, 50, 150, 40); // Set the position and size of the JButton
    this.add(btn);

    this.setLayout(null); // Use null layout
  }

  public static void main(String[] args) {
    new jbutton();
  }
}