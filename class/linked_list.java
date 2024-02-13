import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {
  public static void main(String[] args) {
    LinkedList li = new LinkedList();
    li.add(70);
    li.addFirst(10);
    li.add(30);

    Iterator i = li.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  
  }
}
