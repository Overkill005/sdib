import java.util.*;

public class vector {
  public static void main(String[] args) {
    Vector  v = new Vector ();
    v.add(10);
    v.addElement("Raja");
    v.addElement(10);
    v.addElement(30.6f);
    Enumeration e = v.elements();
    while (e.hasMoreElements()) {
      Object o = e.nextElement();
      System.out.println(o);
    }
  }
}
