import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database database = new Database();
        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setNama("Nasi Goreng");
        menu1.setCategory("Makanan");
        menu1.setPrice(10000);

        Menu menu2 = new Menu();
        menu2.setName("Jus");
        menu2.setCategory("Minuman");
        menu2.setPrice(5000);
        // TODO Insert Menu to Database
        database.insertMenu(menu1);
        database.insertMenu(menu2);
        
        // TODO Display Main Menu and User must be Register First
        public void mainMenu() {
            User user = new User();
            user.register();
            System.out.println("Selamat datang di Restoran EAD");
            System.out.println("Silahkan pilih menu");
            System.out.println("===========================");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Cari Menu");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.print("Pilih menu: ");
            Scanner scanner = new Scanner(System.in);
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    // TODO Display Menu
                    database.showMenu();
                    break;
                case 2:
                    // TODO Search Menu
                    System.out.print("Masukkan nama menu: ");
                    String nama = scanner.next();
                    database.searchMenu(nama);
                    break;
                case 3:
                    // TODO Exit Program
                    System.out.println("Terima kasih telah berkunjung");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
        // TODO Create User from register in Main Menu
        user.setNama(nama);
        user.setNoTelepon(noTelepon);
        // TODO Display Menu
        public void showMenu() {
            database.showMenu();
        }
}
