import java.util.ArrayList;

public class ConsulGame extends Electronics {

    private ArrayList<String> items;

    public ConsulGame(String companyName,double volume, ProductCategory category, int productionYear){
        super(companyName, volume, category, productionYear);
        this.items = new ArrayList<String>();
    }

    public void addToItems(String s){
        items.add(s);
    }
}
