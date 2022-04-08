import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += 1;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (double prices : lineItems){
            sum += prices;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }

    public void addCustomer(ArrayList<String> customersList) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s. \n", userName);
        System.out.printf("There are %s people in front of you. \n", customersList.size());
        customersList.add(userName);
        System.out.println(customersList);
    }

}