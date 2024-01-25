
class Employee{
    int id;
    Employee(int i ){
        id=i;
    }
    Employee(Employee oldobj){
        this.id=oldobj.id;
    }
}


public class copyConstructor {
    public static void main(String[] args) {
        Employee e1=new Employee(100);
        Employee e2=new Employee(e1);
        System.out.println(e2.id);
    }
    
}
