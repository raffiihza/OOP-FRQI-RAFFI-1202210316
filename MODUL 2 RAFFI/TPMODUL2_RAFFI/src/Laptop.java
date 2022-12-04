class Laptop extends Perangkat {
    // variabel disini
    protected boolean webcam;

    // constructor disini
    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive,ram,processor);
        this.webcam = webcam;
    }

    // method disini
    public void informasi() {
        System.out.print("Laptop ini memiliki drive tipe "
        + this.drive + " dengan RAM sebesar " + this.ram + " GB dan prosesor secepat " + String.format("%.2f", this.processor)
        + " GHz." + " Selain itu laptop ini ");
        String tampilwebcam = (this.webcam == true) ? "juga memiliki webcam" : "tidak memiliki webcam";
        System.out.println(tampilwebcam + ".");
    }
    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }
    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan " + email2);
    }
}
