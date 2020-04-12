public class Vegetables extends Food {

    private String NameOfProducerCity;

    public Vegetables(String companyName,double volume, ProductCategory category, String expirationDate, String nameOfProducerCity){
        super(companyName, volume, category, expirationDate);
        this.NameOfProducerCity = nameOfProducerCity;
    }
}
