public class q10 {
    public static void main(String[] args) {
        int a = 7, b = 5;
        System.out.println("1st method");
        System.out.println("a : " + a + "\tb : " + b);
        int c = a + b;
        b = c - b;
        a = c - a;
        System.out.println("a : " + a + "\tb : " + b);
        System.out.println("\n2nd method");

        int x = 7, y = 5;
        System.out.println("x : " + x + "\ty : " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x : " + x + "\ty : " + y);
        int p = 7, q = 5;
        System.out.println("\n3rd method");

        System.out.println("p : " + p + "\tq : " + q);
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("p : " + p + "\tq : " + q);

        int l = 7, m = 5;
        System.out.println("\n3rd method");

        System.out.println("l : " + l + "\tm : " + m);
        l = l ^ m;
        m = l ^ m;
        l = l ^ m;
        System.out.println("l : " + l + "\tm : " + m);
    }

}