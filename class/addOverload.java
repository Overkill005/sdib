public class addOverload {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        addOverload obj = new addOverload();
        System.out.println(obj.add(5, 3));
        System.out.println(obj.add(2.1f, 6.2f));
    }
}
