public class Student{
    double[] Grades;
    int[] Weigth;
    public Student(double[] grades , int[] weigth){
        this.Weigth = weigth;
        this.Grades = grades;
    }
    public static double GetAverage(Student s){
        double sum = 0;
        int SUM = 0;
        for(int i = 0; i < s.Grades.length; ++i)
            sum += s.Grades[i] * s.Weigth[i];
        for(int j = 0;j < s.Weigth.length; ++j)
            SUM += s.Weigth[j];
        return sum/SUM;
    }

    public static void main(String[] args) {
        Student s1 = new Student(new double[]{20,19,15,12} , new int[]{1,3,3,2});
        Student s2 = new Student(new double[]{12,18,19} , new int[]{2,1,3});
        System.out.println(GetAverage(s2));
    }
}
