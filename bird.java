public class bird {
    void fly() {
        System.out.println("Flying");
    }

    void makeSound() {
        System.out.println("Chirping");
    }
}

class sparrow extends bird {
    public static void main(String[] args) {
        sparrow obj = new sparrow();
        obj.fly();
        obj.makeSound();
    }
}

class eagle extends bird {
    public static void main(String[] args) {
        eagle obj = new eagle();
        obj.fly();
        obj.makeSound();
    }
}