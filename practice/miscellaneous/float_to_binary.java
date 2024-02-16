public class float_to_binary {
    public static void main(String[] args) {
        float i=20.6f;
        int k=Float.floatToIntBits(i);
        String bin=Integer.toBinaryString(k);
        System.out.println(bin);
    }
}
