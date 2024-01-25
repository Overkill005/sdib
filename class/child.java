class superClass{
    int i=100;
}public class child extends superClass{
    int j=200;
    public static void main(String[] args) {
        child obj=new child();
        System.out.println(obj.i);
    }

}
