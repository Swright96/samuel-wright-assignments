import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //default Order constructor
    public Order (){
        this.name = "Guest";
        ArrayList<Item> items = new ArrayList<Item>();
    }
    // Overloaded Order constructor
    public Order (String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //Gettors and Setters
    public String getOrderName(){
        return name;
    }
    public void setOrderName(String name){
        this.name = name;
    }
    public boolean getReadyStatus(){
        return ready;
    }
    public void setReadyStatus(boolean ready){
        this.ready = ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    //Methods
    public void addItem(Item Item){
        this.items.add(Item);
    }
    public String getStatusMessage(){
        if (this.ready == true){
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting, your order will be ready shortly.";
        }
    }
    public double getOrderTotal(){
        double sum = 0.0;
        for (Item i: this.items){       //previously for (int i = 0; i < this.items.size(); i++)
            sum += i.getItemPrice();    //would return error int cannot be dereferenced
        }
        return sum;
    }
    public void display(){
        System.out.printf("Customer Name: %s", this.getOrderName());
        for (int i = 0; i < this.items.size(); i++){
            System.out.printf("%s - %s \n", this.items.get(i).getItemName(), this.items.get(i).getItemPrice());
        }
        System.out.println(getOrderTotal());
    }
}
