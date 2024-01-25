public class finalizer {
    public finalizer(){
        System.out.println("Hello constructor...");
    }
    protected void finalize(){
        System.out.println("Object is destroyed by garbage collector");
    }
    public static void main(String[] args) {
        finalizer obj=new finalizer();
        obj.finalize();
    }
    
}
