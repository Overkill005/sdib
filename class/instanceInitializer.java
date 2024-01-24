
public class instanceInitializer {
    {
        System.out.println("Initializer block");
    }
    instanceInitializer(){
        System.out.println("Hello constructor");
    }
    public static void main(String[] args) {
        System.out.println("Hello main");
        instanceInitializer obj=new instanceInitializer();
    }

}//constructor called when object is created..................initializer block is called before constructor
