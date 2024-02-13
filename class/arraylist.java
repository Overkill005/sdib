import java.util.ArrayList;

public class arraylist {
  public static void main(String[] args) {
    ArrayList<Integer> li = new ArrayList<Integer>();
    li.add(10);
    li.add(20);
    li.add(10);
    li.add(30);
    System.out.println(li.get(3));
    for (Object i : li) {
      System.out.println(i);
    }
    System.out.println(li.contains(10));
  }
}
