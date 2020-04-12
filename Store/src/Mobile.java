public class Mobile extends Electronics {
    private int SizeofPage;
    public Mobile(String companyName,double volume, ProductCategory category, int productionYear, int sizeofPage){
        super(companyName, volume, category, productionYear);
        this.SizeofPage = sizeofPage;
    }
}
