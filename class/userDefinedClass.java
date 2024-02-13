import java.util.ArrayList;
import java.util.Iterator;

class Student {
  int sid;
  String name;

  Student(int i, String n) {
    sid = i;
    name=n;
  }
}
public class userDefinedClass {
  public static void main(String[] args) {
    Student s1 = new Student(15, "Sanskar");
    Student s2 = new Student(20, "Dibya");
    ArrayList<Student> li = new ArrayList<Student>();
    li.add(s1);
    li.add(s2);
    Iterator<Student> i = li.iterator();
    while (i.hasNext()) {
      Student s = i.next();
      System.out.println("SID : "+s.sid+"\tName : "+s.name);
    }
  }
}
