class Student{
    int roll=1;
}

public class obj_roll {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.roll=25;
        System.out.println(s1.roll+" "+s2.roll);
    }
}
