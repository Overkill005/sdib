public class disarium {
    int countDigits(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=134,k=n,s=0;
        disarium obj=new disarium();
        int c=obj.countDigits(n);
        while(n>0){
            int r=n%10;
            s=s+(int)Math.pow(r,c);
            c--;
            n=n/10;
        }
        if(s==k)
        System.out.println(k+" is disarium number");
        else
        System.out.println(k+" is not disarium number");
    }
}
