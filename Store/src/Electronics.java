public class Electronics extends Product {

    private int ProductionYear;

    public Electronics(String companyName,double volume, ProductCategory category, int productionYear){
        super(companyName ,volume, category);
        this.ProductionYear = productionYear;
    }
}
