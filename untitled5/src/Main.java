import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter User Name");
        String username = input.nextLine();
        System.out.println("User Name Is:" + username);
        int[][] Mynumbers ={{1,2,3,4} , {5,6,7}};
        for(int i=0;i<Mynumbers.length;++i) {
            for(int j=0;j<Mynumbers[i].length;++j) {
                System.out.print(Mynumbers[i][j]);
            }
        }
    }
}
