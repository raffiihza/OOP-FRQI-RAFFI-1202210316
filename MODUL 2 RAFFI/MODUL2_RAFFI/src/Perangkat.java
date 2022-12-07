class Perangkat {
    // variabel disini
    protected String drive;
    protected int ram;
    protected float processor;

    // constructor disini
    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    // method disini
    public void informasi() {
        System.out.println("Perangkat yang tidak diketahui datanya memiliki drive tipe "
        + this.drive + " dengan RAM sebesar " + this.ram + " GB dan prosesor secepat " + String.format("%.2f", this.processor)
        + " GHz");
    }
}
