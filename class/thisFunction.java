class Employee { 
    int id;

    Employee(int id) {
        this.id = id;
    }
}

public class thisFunction {
    public static void main(String[] args) {
        Employee e1 = new Employee(10);
        System.out.println(e1.id);

    }
}
