import java.util.ArrayList;

public class TestBarista {
    public static void main(String[] args){
        //Menu Items
        Item item1 = new Item("Mocha", 5.99);
        Item item2 = new Item("Latte", 2.99);
        Item item3 = new Item("Drip Coffee", 4.99);
        Item item4 = new Item("Capuccino", 6.99);
        
        //Orders
        Order order1 = new Order();     //instance of order
        order1.addItem(item1);          //add item to order
        order1.addItem(item2);

        Order order2 = new Order();
        order2.addItem(item3);
        order2.addItem(item2);

        Order order3 = new Order("James");      //overloaded instance of order
        order3.addItem(item2);                  //add item to order
        order3.addItem(item4);

        Order order4 = new Order("Charles");
        order4.addItem(item3);
        order4.addItem(item3);

        Order order5 = new Order("William");
        order5.addItem(item2);
        order5.addItem(item1);


        //Status Functionality test
        order2.setReadyStatus(true);
        order4.setReadyStatus(true);
        System.out.println(order2.getReadyStatus());
        System.out.println(order4.getReadyStatus());
        
        //display Order information
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
