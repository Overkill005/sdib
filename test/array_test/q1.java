import java.util.*;
public class q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 characters : ");
    char a[] = new char[10];
    char ca[] = { 'a', 'e', 'i', 'o', 'u' };
    int c = 0;
    for (int i = 0; i < 10; i++) {
      a[i] = sc.next().charAt(0);
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        a[j] = Character.toLowerCase(a[j]);
        if (ca[i] == a[j]) {
          c++;
        }
      }
      System.out.println("Occurence of " + ca[i] + " is : " + c);
      c = 0;
    }
    sc.close();
  }
}
