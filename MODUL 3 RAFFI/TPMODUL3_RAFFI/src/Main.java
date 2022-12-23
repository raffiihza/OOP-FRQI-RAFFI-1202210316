import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tanya = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        try {
            System.out.println("Welcome to our restaurant!");
            System.out.println("");
            System.out.println("Enter customer ID: ");
            int customerID = tanya.nextInt();
            System.out.println("Enter how much food to made: ");
            int orderQty = tanya.nextInt();
            Thread threadRestaurant = new Thread(restaurant);
            Waiters waiters = new Waiters(orderQty, customerID);
            Thread threadWaiters = new Thread(waiters);
            threadRestaurant.start();
            threadWaiters.start();
            threadRestaurant.join();
            threadWaiters.join();
        } catch (Exception e) {
            System.out.println("Sorry, the input must be integer!");
        } finally {
            tanya.close();
        }
    }
}
