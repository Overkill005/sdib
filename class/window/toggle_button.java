import javax.swing.*;

public class toggle_button extends JFrame {

  toggle_button() {
    JFrame f = new JFrame();
    JToggleButton b1 = new JToggleButton("ON");
    b1.setBounds(50, 50, 100, 100);
    f.setSize(400, 400);
    f.setVisible(true);
    b1.setLocation(100, 100);
    f.add(b1);

    // f.setLayout(null);   without this the image shows full screen
    f.setLayout(null);
  }

  public static void main(String[] args) {
    new toggle_button();
  }
}
