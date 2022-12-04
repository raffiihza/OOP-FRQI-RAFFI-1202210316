import java.util.Scanner;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public String nama;
    public int noTelepon;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoTelepon(int noTelepon) {
        this.noTelepon = noTelepon;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(String nama, int noTelepon) {
        System.out.println("===========================");
        System.out.println("Register success");
        System.out.println("Nama: " + nama);
        System.out.println("No. Telepon: " + noTelepon);
    }
}
