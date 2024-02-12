import javax.swing.*;

public class image extends JFrame {

  image() {
    JFrame f = new JFrame();
    JButton b = new JButton(
      new ImageIcon("C:\\xampp\\htdocs\\html\\media\\scenery.jpg")
    );
    f.add(b);
    f.setSize(400, 400);
    f.setVisible(true);

    // f.setLayout(null);   without this the image shows full screen
    f.setLayout(null);
  }

  public static void main(String[] args) {
    new image();
  }
}
