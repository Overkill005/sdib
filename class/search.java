import java.util.Scanner;

public class search {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int l = sc.nextInt();
    System.out.println("Enter " + l + " numbers : ");
    int arr[] = new int[l];
    int flag=0;
    for (int i = 0; i < l; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter element to be searched : ");
    int n = sc.nextInt();
    for (int i = 0; i < l; i++) {
      if (arr[i] == n) {
        flag++;
      }
    }
    if (flag == 0) {
      System.out.println(n + " is not found");
    }
    else {
      System.out.println(n+" is found "+flag+" times");
    }
    sc.close();
  }
}
