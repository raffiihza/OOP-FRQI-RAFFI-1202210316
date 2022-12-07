public class TransportasiAir {
    // variabel disini
    protected int jumlahKursi;
    protected int biaya;

    // constructor disini
    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    // method disini
    public void informasi() {
        System.out.println("Transportasi air yang tidak diketahui jenisnya dengan kursi berjumlah "
        + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh() {
        System.out.println("Transportasi air dengan jenis yang tidak diketahui berlabuh di pantai");
    }
}