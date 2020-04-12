public class Pants extends Cloths {
    private String Gender;
    public Pants(String companyName,double volume, ProductCategory category, String gender){
        super(companyName, volume, category);
        this.Gender = gender;
    }
}

enum SizeOfPants{
    L,
    M,
    S
}
