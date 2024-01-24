public class employee {
    int eid;
    String name;
    static String compname;
}

class test{
    public static void main(String[] args) {
        employee e1=new employee();
        employee e2=new employee();
        e1.eid=200;
        e1.name="raja";
        e2.eid=300;
        employee.compname="deloitte";
        System.out.println(employee.compname);
    }
}
