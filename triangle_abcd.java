public class triangle_abcd {
    public static void main(String[] args) {
        char i,j,c='A';
        for(i='A';i<='E';i++){
            for(j='A';j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
