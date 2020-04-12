import java.util.ArrayList;

public class course{
    String NAME;
    String INSTRUCTORNAME;
    public course(String name, String instructorname){
        this.NAME = name;
        this.INSTRUCTORNAME = instructorname;
    }
    public String Getinfo(){
        return this.NAME + " -> " + this.INSTRUCTORNAME;
    }
    public static void printcourse(ArrayList<course> names){
        for(int i = 0; i < names.size(); ++i)
            System.out.println(names.get(i).Getinfo());
    }
    public static void main(String[] args){
        course c1 = new course("vahidi" , "ap");
        course c2 = new course("etemadi" , "ap");
        course c3 = new course("talebtash" , "riazi2");
        course c4 = new course("sadeghi" , "fizik");
        ArrayList<course> names = new ArrayList<course>();
        names.add(c1);
        names.add(c2);
        names.add(c3);
        names.add(c4);
        printcourse(names);
    }
}



