import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database database = new Database();
        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setNama("Nasi Goreng");
        menu1.setKategori("Makanan");
        menu1.setHarga(10000);

        Menu menu2 = new Menu();
        menu2.setNama("Jus");
        menu2.setKategori("Minuman");
        menu2.setHarga(5000);
        // TODO Insert Menu to Database
        database.insertMenu(menu1);
        database.insertMenu(menu2);
        
        // TODO Display Main Menu and User must be Register First
        System.out.println("Selamat datang di restoran EAD");
        System.out.println("Silahkan register terlebih dahulu");
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("No. Telepon: ");
        int noTelepon = scanner.nextInt();
        user.register(nama, noTelepon);

        // TODO Display Menu
            System.out.println("===========================");
            System.out.println("Silahkan pilih menu");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Cari Menu");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    // TODO Display Menu
                    database.showMenu();
                    break;
                case 2:
                    // TODO Search Menu
                    System.out.print("Masukkan nama menu: ");
                    String namamenu = scanner.next();
                    database.searchMenu(namamenu);
                    break;
                case 3:
                    // TODO Exit Program
                    System.out.println("Terima kasih telah berkunjung");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
                }
                scanner.close();
            }
        }     
