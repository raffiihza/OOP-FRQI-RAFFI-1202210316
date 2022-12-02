public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat1 = new Perangkat("Adata",2,1.80F);
        perangkat1.informasi();
        System.out.println();
        Laptop laptop1 = new Laptop("Seagate",8,2.40F,true);
        laptop1.informasi();
        laptop1.bukaGame("Dota 2");
        laptop1.kirimEmail("niceyuk@gmail.com");
        laptop1.kirimEmail("aanarji@gmail.com","rusmango@gmail.com");
        System.out.println();
        Handphone handphone1 = new Handphone("Sandisk",3,2.20F,false);
        handphone1.informasi();
        handphone1.telfon(628122122);
        handphone1.kirimSMS(62852112);
        handphone1.kirimSMS(628122122,629292211);
    }
}
