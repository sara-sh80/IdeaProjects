import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String N = input.next();
	    int L = input.nextInt();
	    int R = input.nextInt();
		String S ="";
		for(int i = 0; i < L-1; ++i)
			S += N.charAt(i);
		for(int i = R-1; i >= L-1; --i)
			S += N.charAt(i);
		for(int i = R; i < N.length(); ++i)
			S += N.charAt(i);
		int Y = 0;
		while(Y < S.length() && S.charAt(Y) == '0')
			Y += 1;
		if (Y == S.length())
			System.out.println('0');
		for(int i = Y; i < S.length(); ++i)
			System.out.print(S.charAt(i));


    }
}
