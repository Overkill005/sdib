
import java.io.File;
import java.io.IOException;

public class file_hidden {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    boolean hide = f.isHidden();
    System.out.println(hide);
    
  }
}
