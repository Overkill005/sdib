import java.util.Scanner;
class Programming { //4
  String language;

  Programming() {
    language = "programming languages";
  }

  Programming(String l) {
    language = l;
  }

}

public class q4 {
    public static void main(String[] args) {
    Programming obj1 = new Programming();
    System.out.println("I love " + obj1.language);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a language : ");
    String l = sc.next();
    Programming obj2 = new Programming(l);
    System.out.println("I love " + obj2.language);
    sc.close();
  }
}