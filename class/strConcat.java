public class strConcat {

  public static void main(String[] args) {
    String s1 = "Sanskar";
    s1.concat(" Mohanty");
    String s2 = s1.concat(" Mohanty");
    System.out.println(s1); //prints s1 without changes
    System.out.println(s2);
  }
}
