public class Break{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>30){
            // break;
            continue;
            }
            System.out.println(arr[i]);
        }
    }
}