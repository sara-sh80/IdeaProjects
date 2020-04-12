public class Tv extends Electronics {
    private int SizeofPage;
    public Tv(String companyName,double volume, ProductCategory category, int productionYear, int sizeofPage){
        super(companyName, volume, category, productionYear);
        this.SizeofPage = sizeofPage;
    }
}
