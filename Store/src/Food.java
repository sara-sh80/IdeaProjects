public class Food extends Product {

    private String ExpirationDate;

    public Food(String companyName,double volume, ProductCategory category, String expirationDate){
        super(companyName ,volume ,category);
        this.ExpirationDate = expirationDate;
    }
}

