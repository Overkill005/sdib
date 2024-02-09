
import java.io.File;
import java.io.IOException;

public class is_directory {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    boolean check = f.isDirectory();
    System.out.println(check);
    
  }
}
