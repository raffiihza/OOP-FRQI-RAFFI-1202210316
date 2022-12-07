public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transportasiair = new TransportasiAir(4,20000);
        transportasiair.informasi();
        transportasiair.berlayar();
        transportasiair.berlabuh();
        System.out.println("");

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println("");

        Kapal kapal = new Kapal(50, 100000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}