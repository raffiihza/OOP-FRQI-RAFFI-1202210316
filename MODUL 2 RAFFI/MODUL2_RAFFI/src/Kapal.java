public class Kapal extends TransportasiAir {
    // variabel disini
    protected String mesin;

    // constructor disini
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    // method disini
    public void informasi() {
        System.out.println("Transportasi air jenis kapal dengan kursi berjumlah "
        + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin " 
        + mesin.toLowerCase() + " dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin " 
        + mesin.toLowerCase() + " dengan kecepatan stabil di kisaran " + kecepatan + " knot");
    }
    public void berlabuh() {
        System.out.println("Transportasi air jenis kapal berlabuh di pantai");
    }
}