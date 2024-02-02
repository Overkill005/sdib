import java.util.Scanner;
class Student { //1

  String name;

  Student() {
    name = "Unknown";
  }

  Student(String n) {
    name = n;
  }
}

public class q1 {

  public static void main(String[] args) {
    Student obj1 = new Student();
    System.out.println("Name : " + obj1.name);
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Student obj2 = new Student(s);
    System.out.println("Name : " + obj2.name);
    sc.close();
  }
}
