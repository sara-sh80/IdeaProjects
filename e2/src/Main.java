public class Main {
    static int MaximumValue(int...a) {
        int max = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(MaximumValue(7,13,200,1,5,20,6,2,19));
    }
}
