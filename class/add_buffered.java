import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class add_buffered {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 2 numbers : ");
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    System.out.println("Sum : "+(a+b));
  }
}
