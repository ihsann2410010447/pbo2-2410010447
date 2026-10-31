package id.ac.uniska.pbo2.p07;
public enum Status {
    TERSEDIA("Tersedia"),
    DIPINJAM("Dipinjam");

    private final String keterangan;

    Status(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return keterangan;
    }
}