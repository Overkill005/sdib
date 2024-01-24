public class staticBlock {
    static String compname;
    static{
        compname="sdi";
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("Company :"+compname);
    }
}
