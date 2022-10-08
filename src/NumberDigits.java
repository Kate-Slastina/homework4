import java.util.Scanner;

public class NumberDigits {
    static int sumOfSeven(int a, int b) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        a  = m;
        int h = in.nextInt();
        b = h;
        int n = 0;
        for (int i = a; i < b; ++i) {
            if (i % 7 == 0) {
                while (i > 0) {
                    n = n + i % 10;
                    i /= 10;
                }
            }
        }

        System.out.println(n);
        return n ;
    }
    public static void main(String[] args){
        System.out.println(sumOfSeven(10,30));
    }
}

