
import java.io.IOException;
import java.io.File;

public class delete_file {
  public static void main(String[] args) throws IOException{
    File f = new File("C:\\Users\\RISE202312JAVA32\\Documents\\GitHub\\sdib\\class\\test.txt");
    // System.out.println(f.mkdir()); // if file already present then it prints false
    f.delete();
  }
}
