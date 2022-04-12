public class Item {
    private String name;
    private double price;
    
    //Item Constructors
    public Item(){}

    public Item (String name, double price){
        this.name = name;
        this.price = price;
    }
    //Item name getter
    public String getItemName() {
        return name;
    }
    //Item name setter
    public void setItemName(String name) {
        this.name = name;
    }

    //Item price getter
    public double getItemPrice() {
        return price;
    }
    //Item price setter
    public void setItemPrice(double price){
        this.price = price;
    }
}