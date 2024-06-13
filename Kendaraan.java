public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String jenis, int cc, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.jenis = jenis;
        this.cc = cc;
        this.bulanHarusBayar = bulanHarusBayar;
    }
}