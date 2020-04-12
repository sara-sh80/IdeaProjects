import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double a = (Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2))));
        double b = (Math.sqrt(Math.pow((x2-x3),2)+(Math.pow((y2-y3),2))));
        double c = (Math.sqrt(Math.pow((x3-x1),2)+(Math.pow((y3-y1),2))));
        if((a + b > c)  && (a + c > b)  && (c + b > a)){
            System.out.println("YES");
            double p = (a + b + c)/2;
            double s = (Math.sqrt(p * (p-a) * (p-b) * (p-c)));
            System.out.format("%.2f",(s*100)/100);
        }
        else
            System.out.println("NO");
    }
}

