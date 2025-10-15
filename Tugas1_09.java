import java.util.Scanner;

public class Tugas1_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        String lagi = null;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                continue;
            }

            double diskon = 0;
            double totalHarga = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga -= totalHarga * diskon;
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga yang harus dibayar: Rp " + (int) totalHarga);
            sc.nextLine();
            System.out.print("Apakah ingin input pelanggan lain? (ya/tidak): ");
            lagi = sc.nextLine();

        } while (lagi.equalsIgnoreCase("ya"));

        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + (int) totalPendapatan);
        System.out.println("=== TERIMA KASIH ===");

        sc.close();
    }
}
