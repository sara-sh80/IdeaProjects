import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void CommonIntegerElements(int[] a,int[] b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        int temp;
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < b.length; ++j)
                if(a[i] == b[j])
                    c.add(a[i]);
        for(int i = 0; i < c.size(); ++i)
            for(int j = i+1; j < c.size(); ++j)
                if(c.get(i) > c.get(j)){
                    temp = c.get(i);
                    c.set(i, c.get(j));
                    c.set(j,temp);
                }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int[] a = {1,7,12,54,4,6};
        int[] b = {3,12,1,8,34,6,54,39};
        CommonIntegerElements(a,b);
    }
}
