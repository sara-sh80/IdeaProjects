public class Shoe extends Cloths {
    private int Size;
    private String Gender;
    public Shoe(String companyName,double volume, ProductCategory category, int size, String gender){
        super(companyName, volume, category);
        this.Size = size;
        this.Gender = gender;
    }
}
