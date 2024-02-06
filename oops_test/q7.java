import java.util.Scanner;

class Student { //7
  String name;
  int age;
  String address;

  Student() {
    name = "Unknown";
    age = 0;
    address = "Not available";
  }

  void setInfo(String n, int a) {
    name = n;
    age = a;
  }

  void setInfo(String n, int a, String add) {
    name = n;
    age = a;
    address = add;
  }
}

public class q7 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Student obj[] = new Student[3];
    String n, add;
    int a;
    for (int i = 0; i < obj.length; i++) {

      obj[i] = new Student();
      System.out.println("Enter name : ");
      n = sc.nextLine();
      System.out.println("Enter age : ");
      a = sc.nextInt();
      System.out.println("Enter address : ");
      sc.nextLine();
      add = sc.nextLine();
      if (!add.equals("")) {
        obj[i].setInfo(n, a, add);
      } else {
        obj[i].setInfo(n, a);
      }
    }
      for (int i = 0; i < obj.length; i++) {
        System.out.println(obj[i].name + " " + obj[i].address);

      }


    sc.close();
    }
  }
  
