import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String M = ".com";
        String N = ".net";
        boolean x = S.charAt(0) == 'A'||S.charAt(0) == 'a'||S.charAt(0) == 'E'||S.charAt(0) == 'e'||S.charAt(0) == 'U'
        ||S.charAt(0) == 'u'||S.charAt(0) == 'O'||S.charAt(0) == 'o'||S.charAt(0) == 'I'||S.charAt(0) == 'i';
        int k = 0;
        int p = 0;
        for(int j = 0; j < S.length(); ++j)
            for(int i = 0; i <= 9; ++i)
                if(S.charAt(j) == '0'+i){
                    k = k + 1;
                     p = j;
                }
        int U = 0;
        for(int i = p-1; i >= 0; i--){
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
                break;
            if(S.charAt(i) == '@')
                U += 1;
        }
        boolean W = (U >= 1);
        int r = 4;
        int z = 0;
        for(int i = S.length()-1; i > S.length()-1-M.length(); --i){
            r -= 1;
            if(S.charAt(i) == M.charAt(r))
                z += 1;
        }
        int l = 0;
        r = 4;
        for(int j = S.length()-1; j > S.length()-1-N.length(); --j){
            r -= 1;
            if(S.charAt(j) == N.charAt(r))
                l += 1;
        }
        boolean R = (z == 4 || l == 4);
        if(x && k == 2 && R && W)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
