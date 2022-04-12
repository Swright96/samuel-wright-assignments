import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    //default Order constructor
    public Order (){
        this.name = "Guest";
        this.ready = false;
    }
    // Overloaded Order constructor
    public Order (String name) {
        this.name = name;
        this.ready = false;
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
    public void addItem(Item item){
        this.items.add(item);
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
        System.out.printf("Customer Name: %s \n", this.getOrderName());
        for (Item i: this.items){       //previously for (int i = 0; i < this.items.size(); i++) would spit out similar errors
            System.out.printf("%s - %s \n", i.getItemName(), i.getItemPrice());
        }
        System.out.println("Total - $" + getOrderTotal());
    }
}
