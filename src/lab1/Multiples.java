package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(getSolu(1000, 3, 5));
    }

    static int getSolu(int n, int a, int b) {
        int solu = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                solu++;
                //System.out.println(i);
            }
        }
        return solu;
    }
}
