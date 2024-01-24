public class function {
    int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        function obj=new function();
        int res=obj.add(100,200);
        System.out.println("Addition: "+res);
    }
    
}
