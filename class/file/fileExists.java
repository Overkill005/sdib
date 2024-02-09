
import java.io.File;
import java.io.IOException;

public class fileExists {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    boolean exist = f.exists();
    System.out.println(exist);
    
  }
}
