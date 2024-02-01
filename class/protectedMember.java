

class member {

  protected int i = 100;
}

class b extends member {

  void show() {
    System.out.println(this.i);
  }
}

class c extends com.protectedX {
  void show_package() {
    System.out.println(this.x);
  }
} 

public class protectedMember  {

  public static void main(String[] args) {
    member obj = new member();
    System.out.println(obj.i);
    b obj1 = new b();
    obj1.show();
    c obj2 = new c();
    obj2.show_package();
  }
}
