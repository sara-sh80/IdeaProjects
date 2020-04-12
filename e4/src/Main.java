import java.util.ArrayList;
public class Main {
    static void CommonStringElements(String[] a,String[] b){
        ArrayList<String> name = new ArrayList<String>();
        String temp;
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < b.length; ++j)
                if(a[i] == b[j])
                    name.add(a[i]);
        for(int i = 0; i < name.size(); ++i)
            for(int j = i+1; j < name.size(); ++j)
                if(name.get(i).compareTo(name.get(j)) > 0){
                    temp = name.get(i);
                    name.set(i,name.get(j));
                    name.set(j,temp);
                }
        System.out.println(name);
    }
    public static void main(String[] args) {
        String[] a = {"Sahra" , "Somaye" , "Sarina" , "Ali" , "Sepehr" , "Mahan" , "Maryam" , "Sara" , "Zahra" , "Shiva" };
        String[] b = {"Sara" , "Sarina" , "Soheil" ,"Zahra" , "Shiva" , "Shohre" , "Maryam"};
        CommonStringElements(a,b);
    }
}
