
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_write {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\RISE202312JAVA32\\Documents\\GitHub\\sdib\\test1.txt");
    String s = "Hello guys...";
    byte data[] = s.getBytes();
    FileOutputStream fout = new FileOutputStream(f);
    fout.write(data);
    fout.close();
  }
}
