import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MeriamTipe94 meriam = new MeriamTipe94();
        int pilihan;

        do {
            System.out.println("\nSistem Meriam Tipe 94:");
            System.out.println("1. Muat peluru");
            System.out.println("2. Tembak peluru");
            System.out.println("3. Lihat peluru siap tembak");
            System.out.println("4. Lihat keseluruhan magazine");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan jenis peluru: ");
                    String jenisPeluru = scanner.nextLine();
                    meriam.reloading(jenisPeluru);
                    break;

                case 2:
                    meriam.fire();
                    break;

                case 3:
                    meriam.checkAmmo();
                    break;

                case 4:
                    meriam.displayAmmo();
                    break;

                case 5:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, pilih yang benar Kapten");
            }

            // Menunggu pengguna menekan Enter sebelum melanjutkan
            if (pilihan != 5) { // Tidak menunggu saat keluar dari sistem
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
