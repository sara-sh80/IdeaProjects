import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        while(x != -1){
            double s = (Math.pow(x,2)/4)*(Math.sqrt(3));
            System.out.format("%.4f", (s*10000)/10000);
            System.out.println();
            x = input.nextDouble();
        }
    }
}
