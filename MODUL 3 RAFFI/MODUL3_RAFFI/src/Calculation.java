public class Calculation implements Runnable {
    // variabel disini
    private double radius, side, area;
    private double phi = 3.14;

    // method disini
    public void setSquare(double side) {
            this.side = side;
            this.area = side * side;
    }
    public double getSquare() {
        return this.area;
    }
    public void setCircle(double radius) {
            this.radius = radius;
            this.area = phi * radius * radius;
    }
    public double getCircle() {
        return this.area;
    }
    public void setTrapezoid(double a, double b, double t) {
            this.area = ((a + b) * t) / 2;
    }
    public double getTrapezoid() {
        return this.area;
    }
    public void run() {
        System.out.println("\n=== Program sedang berjalan dalam ===");
        for (int i = 3; i > 0; i--) {
            System.out.println("Memulai dengan thread ke-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread terinterupsi!");
            }
        }
    }
}
