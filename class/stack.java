import java.util.*;
public class stack {
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st);
    st.pop();
    int pos = st.search(20);
    System.out.println(pos);
    boolean res = st.empty();
    System.out.println(res);
    System.out.println(st.peek());
  }
  
}
