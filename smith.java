public class smith {   //85 -->8+5=13  ---> prime factors: 5,17 ---> 5+1+7=13
    int sumDigits(int n) {
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s = s + r;
            n = n / 10;
        }
        return s;
    }

    int prime(int x) {
        int c = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int n = 166;
        smith obj = new smith();
        int s = obj.sumDigits(n);
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && obj.prime(i) == 1) {
                sp = sp + obj.sumDigits(i);
            }
        }
        if (s == sp) {
            System.out.println(n + " is smith number");
        } else
            System.out.println(n + " is not smith number");
    }

}
