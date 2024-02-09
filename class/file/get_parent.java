
import java.io.File;
import java.io.IOException;

public class get_parent {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\RISE202312JAVA32\\Documents\\GitHub\\sdib\\class\\test.txt");
    String parent = f.getParent();
    System.out.println(parent);
  }
}
