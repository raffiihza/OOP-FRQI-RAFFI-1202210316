public class Handphone extends Perangkat {
    // variabel disini
    protected boolean fingerprint;

    // constructor disini
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
    super(drive,ram,processor);
    this.fingerprint = fingerprint;
    }

    // method disini
    public void informasi() {
        System.out.print("Handphone ini memiliki drive tipe "
        + this.drive + " dengan RAM sebesar " + this.ram + " GB dan prosesor secepat " + String.format("%.2f", this.processor)
        + " GHz." + " Selain itu handphone ini ");
        String tampilfp = (this.fingerprint == true) ? "juga memiliki fingerprint" : "tidak memiliki fingerprint";
        System.out.println(tampilfp + ".");
    }
    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke no " + no_hp);
    }
    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke no " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke no " + no_hp1 + " dan " + no_hp2);
    }
}
