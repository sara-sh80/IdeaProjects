import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int r = 0; r < n; ++r) {
             String S = input.next();
             String t = input.next();
             while (true) {
                 boolean found = false;
                 for(int i = 0; i < S.length()-t.length()+1; ++i) {
                     String l = "";
                     boolean b = true;
                     for (int j = 0; j < t.length(); ++j)
                         if (S.charAt(i + j) != t.charAt(j))
                             b = false;
                     if (b == true) {
                         for (int j = 0; j < i; ++j)
                             l += S.charAt(j);
                         for (int j = i + t.length(); j < S.length(); ++j)
                             l += S.charAt(j);
                         S = l;
                         i--;
                         found = true;
                     }
                 }
                 if(found == false)
                     break;
             }
            System.out.println(S);
        }
    }
}
