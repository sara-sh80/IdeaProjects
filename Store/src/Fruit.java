public class Fruit extends Food {

    private String NameOfProducerCity;

    public Fruit(String companyName,double volume, ProductCategory category, String expirationDate, String nameOfProducerCity){
        super(companyName, volume, category, expirationDate);
        this.NameOfProducerCity = nameOfProducerCity;
    }
}
