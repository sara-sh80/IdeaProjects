import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int[] mx = {1, 0, -1, 0};
         int[] my = {0, 1, 0, -1};
         boolean[][] checked = new boolean[n + 2][n+2];
         long [][] array = new long[n + 2][n+2];
         for (int i = 0; i < n + 2; i++) {
             checked[0][i] = checked[i][0] = checked[n+1][i] = checked[i][n+1] = true;
         }
         for(int i = 1;i <= n;++i)
             for(int j = 1;j <= n; ++j) {
                 array[i][j] = input.nextInt();
             }
         long sum = 0;
         int x = 1, y = 1, m = 0, cnt = 0;
         for (int k = 0; k < n * n; k++) {
             //System.out.println(x);
             //System.out.println(y);
             //System.out.println("---");
             sum += array[x][y];
             if (sum == (int)sqrt(sum) * (int)sqrt(sum))
                 cnt += 1;
             checked[x][y] = true;
             if (checked[x+mx[m]][y+my[m]])
                 m = (m + 1) % 4;
             x += mx[m];
             y += my[m];
         }
        System.out.println(cnt);
    }
}
