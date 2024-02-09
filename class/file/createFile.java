
import java.io.File;
import java.io.IOException;

public class createFile {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\RISE202312JAVA32\\Documents\\GitHub\\sdib\\class\\test.txt");
    f.createNewFile();
  }
}
