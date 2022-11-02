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
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.next();
        System.out.print("Masukkan nomor telepon: ");
        int noTelepon = scanner.nextInt();
        System.out.println("Selamat datang " + nama + "!");
        System.out.println("Nomor telepon anda adalah " + noTelepon);
    }
}
