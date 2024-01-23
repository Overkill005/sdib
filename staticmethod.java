
class Employee {
    static String compname;

    static void setname(String cname) {
        compname = cname;
    }
}

public class staticmethod {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee.setname("sdi");
        System.out.println(Employee.compname);
    }
}
