class Area { //6
  void area(int s) {
    int ar = s * s;
    System.out.println("Area of square : " + ar);
  }

  void area(int l, int b) {
    int ar = l * b;
    System.out.println("Area of rectangle : " + ar);
  }
}
public class q6 {
  public static void main(String[] args) {
    Area obj = new Area();
    obj.area(10);
    obj.area(6, 8);
  }
}
