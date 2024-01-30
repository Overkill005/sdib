abstract class shape {

  abstract void draw();
}

class circle extends shape {

  void draw() {
    System.out.println("Circle drawn");
  }
}

class rectangle extends shape {

  void draw() {
    System.out.println("Rectangle drawn");
  }
}

public class shapeAbstract {

  public static void main(String[] args) {
    circle cobj = new circle();
    cobj.draw();
    rectangle robj = new rectangle();
    robj.draw();
  }
}
