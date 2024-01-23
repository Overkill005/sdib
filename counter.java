class Counterr{
//  int count=0;
  int count=0;
    Counterr(){
        count++;
    }
}
public class counter {
    public static void main(String[] args) {
        Counterr obj1=new Counterr();
        Counterr obj2=new Counterr();
        Counterr obj3=new Counterr();
        System.out.println(obj1.count);
        System.out.println(obj2.count);
        System.out.println(obj3.count);
    }
}
