
import java.io.File;
import java.io.IOException;

public class file_modified {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    long modify = f.lastModified();
    System.out.println(modify);
    
  }
}
