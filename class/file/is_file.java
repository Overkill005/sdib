
import java.io.File;
import java.io.IOException;

public class is_file {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    boolean check = f.isFile();
    System.out.println(check);
    
  }
}
