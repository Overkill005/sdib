

public class q7 {
    public static void main(String[] args) {
        int[] a1 = {500,100,200,300,400};
        int[][] a2 = {{100,500,600,70,300},{60,700,100,200,30},{400,80,200,600,200}};
        int[] c = new int[5];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                for (int k = 0; k < a2[j].length; k++) {
                    if (a1[i] == a2[j][k]) {
                        c[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Element " + a1[i] + " appears " + c[i] + " times");
        }

      
    }
}