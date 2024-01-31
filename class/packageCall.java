/* public class packageCall {
    public static void main(String[] args) {
        con.Calc obj = new con.Calc();
        int res = obj.add(100, 200);
        System.out.println(res);
    }
}
 */
// import con.Calc;
import con.*;                                //     use "java packageCall.java" to execute

public class packageCall {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int res = obj.add(100, 200);
        System.out.println(res);
    }
}