
class employee {
    String name = "Sanskar";
    int salary = 1000;
}

class manager extends employee {
    int mid = 1;
    String dept = "cse";

    void manage() {
        System.out.println("Manage");
    }
}

class engineer extends employee {
    int eid;
    String branch;

    void work() {
        System.out.println("Work");
    }
}

public class employeeMain {
    public static void main(String[] args) {
        manager mobj = new manager();
        System.out.println("Name : " + mobj.name);
        System.out.println("Salary : " + mobj.salary);
        System.out.println("Manger ID : " + mobj.mid);
        mobj.manage();
        engineer eobj = new engineer();
        System.out.println("Name : " + eobj.name);
        System.out.println("Salary : " + eobj.salary);
        System.out.println("Manger ID : " + eobj.eid);
        eobj.work();
    }
}
