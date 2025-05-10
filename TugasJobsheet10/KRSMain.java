package TugasJobsheet10;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS krs = new AntrianKRS(10);

        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Sudah KRS");
            System.out.println("8. Cek Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    krs.enqueue(m);
                    break;
                case 2:
                    krs.prosesKRS();
                    break;
                case 3:
                    krs.print();
                    break;
                case 4:
                    krs.lihatDepan();
                    break;
                case 5:
                    krs.lihatAkhir();
                    break;
                case 6:
                    krs.cetakJumlah();
                    break;
                case 7:
                    krs.cetakSudahKRS();
                    break;
                case 8:
                    krs.cetakBelumKRS();
                    break;
                case 9:
                    krs.kosongkan();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
        sc.close();
    }
}
