import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
        Kendaraan[] kendaraan = new Kendaraan[4];
        kendaraan[0] = new Kendaraan("S 4567 YV", "Mobil", 2000, 4);
        kendaraan[1] = new Kendaraan("N 4511 VS", "Mobil", 2500, 3);
        kendaraan[2] = new Kendaraan("AB 4321 A", "Motor", 125, 2);
        kendaraan[3] = new Kendaraan("B 1234 AG", "Motor", 150, 1);

        TransaksiPajak[] transaksi = new TransaksiPajak[4];
        transaksi[0] = new TransaksiPajak(3, 1000000, 0, 1, kendaraan[0]);
        transaksi[1] = new TransaksiPajak(2, 1000000, 0, 2, kendaraan[1]);
        transaksi[2] = new TransaksiPajak(1, 250000, 200000, 3, kendaraan[2]);
        transaksi[3] = new TransaksiPajak(4, 250000, 0, 4, kendaraan[3]);

        Method method = new Method();
        method.menu();

        System.out.print("Pilih(1-5): ");
        int pilih = sc28.nextInt();
        if (pilih == 1) {
            method.daftarKendaraan(kendaraan);
        } else if (pilih == 2) {
            System.out.print("Masukkan Nomor TNKB: ");
            String nomorTNKB = sc28.nextLine();
            method.findTransaksiByTNKB(transaksi, kendaraan, nomorTNKB);

        } else if (pilih == 3) {

        } else if (pilih == 4) {

        } else if (pilih == 5) {
            System.exit(0);
        }

    }

}
