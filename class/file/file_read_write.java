
import java.io.IOException;
import java.io.File;

public class file_read_write {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\RISE202312JAVA32\\Documents\\GitHub\\sdib\\class\\test.txt");
    System.out.println(f.canWrite());
    System.out.println(f.canRead());
    
  }
}
