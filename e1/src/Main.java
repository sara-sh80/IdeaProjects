import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);
        System.out.println("number = " + number);
        int guess = -1;
        while( guess != number){
            System.out.println("What is guess?");
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();
            if(guess < number)
                System.out.println("The guess is smaller than number");
            else if(guess > number)
                System.out.println("The guess is bigger than number");
            else
                System.out.println("Yes,The number is " + guess);
        }

    }
}
