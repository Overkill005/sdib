class member {
  private int i = 100;


  void show() {
    System.out.println(this.i);
  }
}
public class privateMember {
  public static void main(String[] args) {
    member obj = new member();
    // System.out.println(obj.i);    error:  i not visible ............in independant class
  
    obj.show();
  }
}
