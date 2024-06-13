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

    public String getNomorTNKB() {
        return noTNKB;
    }

    public String getJenis() {
        return jenis;
    }

    public double getcc() {
        return cc;
    }

    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
}