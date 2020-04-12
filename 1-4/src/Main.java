import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double x1 = input.nextDouble();
	    double y1 = input.nextByte();
	    double r1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        double d =(Math.sqrt((Math.pow((x2 - x1),2) + (Math.pow((y2 - y1),2)))));
        if(d > r1 + r2){
            System.out.println("0");
        }
        else if(d <= Math.abs(r1 - r2) && r1 >= r2){
            System.out.format("%.3f",(Math.PI*(Math.pow(r2,2))));
        }
        else if(d <= Math.abs(r1 - r2) && r1 < r2){
            System.out.format("%.3f", (Math.PI*(Math.pow(r1,2))));
        }
        double part1 = r1*r1*Math.acos((d*d + r1*r1 - r2*r2)/(2*d*r1));
        double part2 = r2*r2*Math.acos((d*d + r2*r2 - r1*r1)/(2*d*r2));
        double part3 = 0.5*Math.sqrt((-d+r1+r2)*(d+r1-r2)*(d-r1+r2)*(d+r1+r2));

        double intersectionArea = part1 + part2 - part3;
        if(r1 < r2 && d==0){
            System.out.format("%.3f", (Math.PI*(Math.pow(r1,2))));
        }
    }
}

