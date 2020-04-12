public class Product {
    private String CompanyName;
    private double Volume;
    private ProductCategory productcategory;
    public Product(String companyName,double volume,ProductCategory category){
        this.CompanyName = companyName;
        this.Volume = volume;
        this.productcategory = category;
    }

    public double GetVolume(){
        return this.Volume;
    }
}

enum ProductCategory{
    Dairy,
    Vegetables,
    Fruit,
    JunkFood,
    forMan,
    forWoman,
    forChild,
    Tv,
    Mobile,
    ConsulGame
}
