class a{       //  csc to compile
    public void show(){
        public int i=100;
    System.Console.WriteLine("Parent");
    }
}
class b : a{
    public void show(){

        public int i=200;
    System.Console.WriteLine("Child");
    }
}
class override{
    public static void Main(){
        b obj=new b();
    System.Console.WriteLine(obj.i);
    }
}