public class BirthDate {
    int YEAR;
    int MONTH;
    int DAY;
    public BirthDate(int year, int month, int day){
        this.YEAR = year;
        this.MONTH = month;
        this.DAY = day;
    }
    public class student{
        long ID;
        BirthDate birthDate;
        public student(long id, int year, int month, int day){
            this.ID = id;
            this.birthDate = new BirthDate(year, month, day);
        }
        public long getID(){
            return ID;
        }
        public BirthDate getBirthDate(){
            return birthDate;
        }
    }
    public void main(String[] args) {
        student s1 = new student(111223333, 1970, 5, 3);
        System.out.println(s1.getBirthDate());
        System.out.println(s1.getID());

    }
}
