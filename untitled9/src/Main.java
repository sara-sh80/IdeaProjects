import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int year = input.nextInt();
        //boolean twoAndThree = num%3==0 && num%2==0;
        //boolean twoOrThree = num%3==0 || num%2==0;
	    //boolean twoxorThree
       // boolean leap = (year%4==0) && (year%100!=0) || (year%400==0);
        //System.out.println( "is leap:" + leap);
        //Scanner in = new Scanner(System.in);
        //int number = in.nextInt();
        //System.out.println((number%2==0)? "is even":"is odd");
        //String Myname = "sara sheybani";
        //long num = 98243083;
       // System.out.println("My");
        Scanner input = new Scanner(System.in);
        int month = in.nextInt();
        Scanner x = new Scanner(System.in);
        int year = in.nextInt();
        int days = 0;
        boolean leap = (year%4==0) && (year%100!=0) || (year%400==0);
        switch(month){
            case1:
            case2:
            case3:
            case4:
            case5:
            case6:
            days = 31;break;
            case7:
            case8:
            case9:
            case10:
            case11:
            days = 30;break;
            case12:


    }
}
