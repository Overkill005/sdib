
import java.io.File;
import java.io.IOException;

public class get_fileName {
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    String name=f.getName();
    System.out.println(name);
    
  }
}
