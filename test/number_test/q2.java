public class q2 {
    public static void main(String[] args) {
        String i = "100";
        int o = 64;
        System.out.println(i + "\t octal to decimal is " + Integer.parseInt(i, 8));
        System.out.println(o + "\t decimal to octal is " + Integer.toOctalString(o));
        System.out.println(i + "\t binary to decimal is " + Integer.parseInt(i, 2));
        System.out.println(o + "\t decimal to octal is " + Integer.toBinaryString(o));
        System.out.println(i + "\t hexadecimal to decimal is " + Integer.parseInt(i, 16));
        System.out.println(o + "\t decimal to octal is " + Integer.toHexString(o));
    }
}
