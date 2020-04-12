public class BirthDate {
    int YEAR;
    int MONTH;
    int DAY;
    public BirthDate(int year, int month, int day){
        this.YEAR = year;
        this.MONTH = month;
        this.DAY = day;
    }
    public static void main(String[] args) {
        student s1 = new student(111223333, 1970, 5, 3);
        System.out.println(s1.getBirthdate().YEAR);
        System.out.println(s1.getBirthdate().MONTH);
        System.out.println(s1.getBirthdate().DAY);
        System.out.println(s1.getID());

    }
}
class student{
    long ID;
    BirthDate birthDate;
    public student(long id, int year, int month, int day){
        this.ID = id;
        this.birthDate = new BirthDate(year, month, day);
    }
    public long getID(){
        return ID;
    }
    public BirthDate getBirthdate(){
        return birthDate;
    }

}