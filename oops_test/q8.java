class Degree {
  void getDegree() {
    System.out.println("I got a degree");
  }
}

class UnderGraduate extends Degree {
  void getDegree() {
    System.out.println("I am under-graduate");
  }
}
class PostGraduate extends Degree {
  void getDegree() {
    System.out.println("I am post-graduate");
  }
}
public class q8 {
  public static void main(String[] args) {
    Degree dobj = new Degree();
    UnderGraduate uobj = new UnderGraduate();
    PostGraduate pobj = new PostGraduate();
    dobj.getDegree();
    uobj.getDegree();
    pobj.getDegree();
  }
}
