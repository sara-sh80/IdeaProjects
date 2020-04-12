import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String S = input.next();
	    int right = S.length();
	    int k = 0;
	    for(int r = 0;r < right; ++r){
	    	String t = "";
			for(int i = 0; i < S.length() - 1; ++i){
				if(S.charAt(i) == '(' && S.charAt(i + 1) == ')'){
					k += 2;
					for(int j = 0; j < i; ++j)
						t += S.charAt(j);
					for(int j = i+2; j < S.length(); ++j)
						t += S.charAt(j);
					break;
				}
			}
			S = t;
			//System.out.println(S);
		}
		System.out.println(right - k);




    }
}
