import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("What is the number? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean TwoAndThree = (n%2==0) && (n%3==0);
        boolean TwoOrThree = (n%2==0) || (n%3==0);
        boolean TwoXorThree = (n%2==0) ^ (n%3==0);
        System.out.println("TwoAndThree = " + TwoAndThree );
        System.out.println("TwoOrThree = " + TwoOrThree);
        System.out.println("TwoXorThree = " + TwoXorThree);
        System.out.println("What is the number? ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println((x%5==0)? "Hifive" : "Hieven");
    }
}
