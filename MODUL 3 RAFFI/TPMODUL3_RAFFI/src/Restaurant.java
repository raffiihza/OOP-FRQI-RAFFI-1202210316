public class Restaurant implements Runnable {
    // variabel disini
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    // variabel disini
    public void run() {
        while(true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }
    public int getFoodNumber() {
        return foodNumber;
    }
    public void makeFood() {
        synchronized(lock) {
            if (waitingForPickup == true) {
                try {
                    System.out.println("Restaurant: waiting for the waiter to deliver the food");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant: making food number " + foodNumber);
            foodNumber++;
            lock.notifyAll();
            System.out.println("Restaurant: telling the waiter to get the food");
        }
    }
    public static Object getLock() {
        return lock;
    }
}
