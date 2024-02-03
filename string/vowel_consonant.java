import java.util.*;

public class vowel_consonant {

  static int vowel(char ch) {
    int c = 0;
    if (ch == 'A' ||
        ch == 'a' ||
        ch == 'E' ||
        ch == 'e' ||
        ch == 'I' ||
        ch == 'i' ||
        ch == 'O' ||
        ch == 'o' ||
        ch == 'U' ||
        ch == 'u')
      c = 1;
    return c;
  }

  static int consonant(char ch) {
    int k = ch, c = 0;
    if ((k >= 65 && k < 91) || (k >= 97 && k < 123)) {
      if (vowel_consonant.vowel(ch) == 0) {
        c = 1;
      }
    }
    return c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    System.out.println("Enter a choice\n1. for checking vowel\n2. for checking consonant");
    int c = sc.nextInt();
    switch (c) {
      case 1:
        if (vowel_consonant.vowel(ch) == 1) {
          System.out.println(ch + " is vowel");
        } else {
          System.out.println(ch + " is not vowel");

        }
        break;
      case 2:
        if (vowel_consonant.consonant(ch) == 1) {
          System.out.println(ch + " is consonant");
        } else {
          System.out.println(ch + " is not consonant");

        }
        break;
      default:
        System.out.println("Not valid alphabet");
        break;

    }
    sc.close();
  }
}
