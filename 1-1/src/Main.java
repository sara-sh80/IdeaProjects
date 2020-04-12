import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    long xx = input.nextLong();
            int max = 0;
            int y = 0;
            for(int i = 0; i <= 9; ++i) {
                long x = xx;
                int k = 0;
                while (x > 0) {
                    long b = x % 10;
                    x = x / 10;
                    if (i == b) {
                        k = k + 1;
                    }
                }
                if (k > y) {
                    max = i;
                    y = k;
                }

            }
            System.out.println(max);

    }
}
