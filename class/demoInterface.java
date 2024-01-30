interface demoInterface {
  void show();
    int a=300;
}
/*  1st compile..............now use javap demoInterface
It shows:               
interface demo {
  public static final int a;
  public abstract void show();
} */