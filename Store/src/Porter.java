import java.util.ArrayList;

public class Porter extends User{
    private Store store;
    private Vehicle vehicle;
    private ArrayList<Order> deliveringList;
    private ArrayList<Order> deliveredList;
    private ArrayList<Order> filteredOrders;
    private double sum ;

    public Porter(String username, int password, Store s, Vehicle v){
        super(username, password);
        this.store = s;
        this.deliveringList = new ArrayList<Order>();
        this.deliveredList = new ArrayList<Order>();
        this.vehicle = v;
        this.filteredOrders = new ArrayList<Order>();
        this.sum = 0;
    }

    public ArrayList<Order> getFilteredOrders(){
        ArrayList<Order> filteredOrders = store.getOrdersInWaitingList();
        double v = 0.5;
        if (this.vehicle.equals(Vehicle.Car))
            v = 2;
        if (this.vehicle.equals(Vehicle.Truck))
            v = 12;
        for(int i = 0; i < filteredOrders.size(); ++i){
            if(this.filteredOrders.get(i).getProduct().GetVolume() > v)
                filteredOrders.remove(this.filteredOrders.get(i));
        }
        return filteredOrders;
    }

    public void addToDeliveringList(Order o){
        deliveringList.add(o);
        store.RemoveOrderFromWaitingOrders(o);
        o.ChangeOrderStatusToDelivering();
    }

    public ArrayList<Order> getDeliveringList(){
        return this.deliveringList;
    }

    public void addToDeliveredList(Order o){
        deliveredList.add(o);
        deliveringList.remove(o);
        o.ChangeOrderStatusToDelivered();
        sum += o.getProduct().GetVolume();
    }

    public double getSum(){
        return sum;
    }

    public ArrayList<Order> getDeliveredList(){
        return this.deliveredList;
    }

    public void ChangeVehicle(Vehicle v){
        this.vehicle = v;
    }
}

enum Vehicle {
    Car,
    MotorCycle,
    Truck
}