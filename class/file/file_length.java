import java.io.File;
import java.io.IOException;

public class file_length {
  
  public static void main(String[] args) throws IOException {
    File f = new File("test.txt");
    long l = f.length();
    System.out.println(l);
    
  }
}
