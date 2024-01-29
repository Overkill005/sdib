class a {
    // int i = 100;
    public void show() {
        System.out.println("100 Parent");
    }
}

class b extends a {
    // int i = 555;
    public void show() {
        System.out.println("555 Child");
    }
}

class override {
    public static void main(String args[]) {
        a obj = new b();
        // System.out.println(obj.i);
        obj.show();
    }
}