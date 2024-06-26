public class Method {
    void menu() {
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan ");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan Seluruh Transaksi");
        System.out.println("4. Ururtkan Transaksi Berdasarkan Nama Pemilik");
        System.out.println("5. Keluar");
    }

    void daftarKendaraan(Kendaraan[] kendaraan) {
        System.out.println("++++++++++++++++++++++++");

        System.out.println("Daftar Kendaraan");

        System.out.println("++++++++++++++++++++++++");

        System.out.println();
        for (int i = 0; i < kendaraan.length; i++) {
            Kendaraan k = kendaraan[i];
            System.out.printf("ID: %2d | TNKB: %-10s | Jenis: %-10s | CC: %.2f | Bulan Harus Bayar: %d%n",
                    i + 1, k.getNomorTNKB(), k.getJenis(), k.getcc(), k.getBulanHarusBayar());
        }

    }

    public void findTransaksiByTNKB(TransaksiPajak[] transaksi, Kendaraan[] kendaraan, String nomorTNKB) {
        boolean found = false;
        for (TransaksiPajak tp : transaksi) {
            Kendaraan k = tp.getKendaraan();
            if (k.getNomorTNKB().equalsIgnoreCase(nomorTNKB)) {
                found = true;
                System.out.println("Transaksi untuk kendaraan dengan nomor TNKB " + nomorTNKB + ":");
                System.out.println("Kode Transaksi: " + tp.getKode());
                System.out.println("Nominal Bayar: " + tp.getNominalBayar());
                System.out.println("Denda: " + tp.getDenda());
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("Kendaraan dengan nomor TNKB " + nomorTNKB + " tidak ditemukan.");
        }

    }
}
