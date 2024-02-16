class Rectangle { //2

  int length, breadth;

  int area() {
    int ar = length * breadth;
    return ar;
  }

  Rectangle() {
    length = 0;
    breadth = 0;
  }

  Rectangle(int l, int b) {
    length = l;
    breadth = b;
  }

  Rectangle(int n) {
    length = n;
    breadth = n;
  }
}

public class q2 {

  public static void main(String[] args) {
    Rectangle obj1 = new Rectangle();
    Rectangle obj2 = new Rectangle(6);
    Rectangle obj3 = new Rectangle(5, 4);
    System.out.println(obj1.area());
    System.out.println(obj2.area());
    System.out.println(obj3.area());
  }
}
