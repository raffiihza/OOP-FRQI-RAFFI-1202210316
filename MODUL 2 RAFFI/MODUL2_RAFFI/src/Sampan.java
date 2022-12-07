public class Sampan extends TransportasiAir {
    // variabel disini
    protected int layar;

    // constructor disini
    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    // method disini
    public void informasi() {
        System.out.println("Transportasi air jenis sampan dengan kursi berjumlah "
        + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan " 
        + layar + " layar");
    }
    public void berlabuh() {
        System.out.println("Transportasi air jenis sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar) {
        System.out.println("Transportasi air jenis sampan berlabuh di pantai menggunakan "
        + jangkar + " jangkar");
    }
}