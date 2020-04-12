import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; ++i){
            int k = 0;
            int number = input.nextInt();
            for(int j = 1; j <= number ; ++j){
                if(number % j == 0)
                    k = k + 1;
            }
            if(k == 3)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
