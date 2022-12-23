public class Waiters implements Runnable {
    // variabel disini
    private int orderQty;
    private int customerID;
    static int foodPrice = 15000;

    // constructor disini
    public Waiters(int orderQty, int customerID) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    // method disini
    public void run() {
        while(true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void orderInfo() {
        System.out.println("==========");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Number of Food: " + orderQty);
        System.out.println("Total Price: " + (orderQty * foodPrice));
        System.out.println("==========");

    }
    public void getFood() {
        Object lock = Restaurant.getLock();
        synchronized(lock) {
            System.out.println("Waiter: food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);
            if(restaurant.getFoodNumber() == orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            lock.notifyAll();
            System.out.println("Waiter: tell the restaurant to make another food");
        }
    }
}
