import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int sum = num1 + num2;
        Scanner input = new Scanner(System.in);
        int student = input.nextInt();
        boolean b = sum == student;
        System.out.println(b);
    }
}
