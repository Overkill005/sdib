class rectangle {

  int calculateArea(int b, int l) {
    return l * b;
  }
}

class circle {

  double calculateArea(double r) {
    double pi = 3.14;
    return pi * r * r;
  }
}

public class shape {

  public static void main(String[] args) {
    circle cobj = new circle();
    rectangle robj = new rectangle();
    System.out.println(robj.calculateArea(4, 5));
    System.out.println(cobj.calculateArea(7));
  }
}
