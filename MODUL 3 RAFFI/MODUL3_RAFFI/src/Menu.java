import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        Calculation kalkulator = new Calculation();
        do {
            System.out.println("=== Program Menu ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Luas Trapesium");
            System.out.println("0. Keluar");
            try {
                System.out.print("Masukkan menu: ");
                int menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("\nMasukkan sisi persegi: ");
                        double side = input.nextDouble();
                        if(side < 1) {
                            System.out.println("\nError: Input tidak boleh di bawah 1!\n");
                            break;
                        }
                        kalkulator.setSquare(side);
                        Thread thread = new Thread(kalkulator);
                        thread.start();
                        try {
                            thread.join();
                        } catch (InterruptedException e) {
                            System.out.println("Thread terinterupsi!");
                        }
                        System.out.println("\nLuas persegi: " + kalkulator.getSquare() + "\n");
                        break;
                    case 2:
                        System.out.print("\nMasukkan jari-jari lingkaran: ");
                        double radius = input.nextDouble();
                        if(radius < 1) {
                            System.out.println("\nError: Input tidak boleh di bawah 1!\n");
                            break;
                        }
                        kalkulator.setCircle(radius);
                        Thread thread2 = new Thread(kalkulator);
                        thread2.start();
                        try {
                            thread2.join();
                        } catch (InterruptedException e) {
                            System.out.println("Thread terinterupsi!");
                        }
                        System.out.println("\nLuas lingkaran: " + kalkulator.getCircle() + "\n");
                        break;
                    case 3:
                        System.out.print("\nMasukkan sisi atas trapesium: ");
                        double a = input.nextDouble();
                        System.out.print("Masukkan sisi bawah trapesium: ");
                        double b = input.nextDouble();
                        System.out.print("Masukkan tinggi trapesium: ");
                        double t = input.nextDouble();
                        if(a < 1 || b < 1 || t < 1) {
                            System.out.println("\nError: Input tidak boleh di bawah 1!\n");
                            break;
                        }
                        kalkulator.setTrapezoid(a, b, t);
                        Thread thread3 = new Thread(kalkulator);
                        thread3.start();
                        try {
                            thread3.join();
                        } catch (InterruptedException e) {
                            System.out.println("Thread terinterupsi!");
                        }
                        System.out.println("\nLuas trapesium: " + kalkulator.getTrapezoid() + "\n");
                        break;
                    case 0:
                        System.out.println("\nProgram keluar!");
                        repeat = false;
                        break;
                    default:
                        System.out.println("\nError: Menu tidak tersedia!\n");
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("\nError: Input yang diberikan tidak sesuai!\n");
            } catch (InputMismatchException e) {
                System.out.println("\nError: Input harus berupa angka!\n");
                input.next();
            } 
        } while (repeat);
    input.close();
    }
}
