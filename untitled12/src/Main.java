import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What is number month? ");
	    Scanner input = new Scanner (System.in);
	    int month = input.nextInt();
        System.out.println("What is number year? ");
        Scanner in = new Scanner (System.in);
        int year = in.nextInt();
        int numberdays = 0;
        switch(month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                numberdays = 31;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                numberdays = 30;
                break;
            case 12:
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                numberdays = 30;
            else
                numberdays = 29;
            break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numberdays);

    }
}
