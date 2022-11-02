import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    public List<Menu> listMenu = new ArrayList<Menu>();
    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu) {
        listMenu.add(menu);
    }
    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println("Nama Menu: " + listMenu.get(i).nama);
            System.out.println("Kategori Menu: " + listMenu.get(i).kategori);
            System.out.println("Harga Menu: " + listMenu.get(i).harga);
            System.out.println("");
        }
    }
    // TODO Create Method to Search Menu from Database
    public void searchMenu(String nama) {
        for (int i = 0; i < listMenu.size(); i++) {
            if (listMenu.get(i).nama.equals(nama)) {
                System.out.println("Nama Menu: " + listMenu.get(i).nama);
                System.out.println("Kategori Menu: " + listMenu.get(i).kategori);
                System.out.println("Harga Menu: " + listMenu.get(i).harga);
                System.out.println("");
            }
        }
    }
}
