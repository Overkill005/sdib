class Employee{     //assign value to atttribute of an object
    int id;
    String name;
    Employee(){
        System.out.println("Hello");
    }
    Employee(int i, String n){
        this();                                //to call constructor above it
        System.out.println(this.id);
        id=i;
        name=n;
    }
}


public class constructor {
    public static void main(String[] args) {
        Employee e1=new Employee(100,"raja");
        System.out.println(e1.id);
        Employee e2=new Employee(111,"aja");
    }
}
