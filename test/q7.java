public class q7 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        if (a < b) {
            System.out.println(true);
        }
        if (b > a) {
            System.out.println(b + " is greater");
        }
        if (a <= c) {
            System.out.println(c + " greater than equal to " + a);
        }
        if (a != c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (a == b && a == c) {
            System.out.println("All equal");
        } else {
            System.out.println("Not equal");
        }
        if (a == b || a == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        boolean d = true;
        if (!d == false) {
            System.out.println(d);
        }
        System.out.println("a: " + (++a));
        System.out.println("a: " + (--a));
    }
}
