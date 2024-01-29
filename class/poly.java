class dog {
    void say() {
        System.out.println("Vow");
    }
}

class cat {
    void say() {
        System.out.println("Meow");
    }
}

class poly {
    public static void main(String[] args) {
        dog obj = new dog();
        cat obj1 = new cat();
        obj.say();
        obj1.say();
    }
}