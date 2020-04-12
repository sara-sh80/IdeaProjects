public class Shirt extends Cloths {
    private String Gender;
    public Shirt(String companyName,double volume, ProductCategory category,String gender){
        super(companyName,volume,category);
        this.Gender = gender;
    }
}
enum SizeOfShirt{
    L,
    M,
    S
}
