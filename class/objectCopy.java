
class emp{
    int id;
    emp(int i){
        id=i;
    }
    emp(){
        
    }
}
public class objectCopy {
    public static void main(String[] args) {
        
        emp e1=new emp(100);
        emp e2=new emp();
        e2.id=e1.id;
        System.out.println(e1);
        System.out.println(e2);
    }
}
