package TugasPertemuan13;

import java.util.Scanner;

public class DLLMain15 {
    public static void main(String[] args) {
        DoubleLinkedList15 list = new DoubleLinkedList15();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n====== Menu Double Linked List Mahasiswa ======");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah pada indeks tertentu");
            System.out.println("4. Sisip setelah NIM tertentu");
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Hapus pada indeks tertentu");
            System.out.println("9. Tampilkan seluruh data");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data pada indeks tertentu");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa15 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa15 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa15 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 4 -> {
                    System.out.print("Masukkan NIM sebagai acuan: ");
                    String key = scan.nextLine();
                    Mahasiswa15 mhs = inputMahasiswa(scan);
                    list.insertAfter(key, mhs);
                }
                case 5 -> list.removeFirst();
                case 6 -> list.removeLast();
                case 7 -> {
                    System.out.print("Masukkan NIM sebagai acuan penghapusan: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 9 -> list.print();
                case 10 -> {
                    Mahasiswa15 mhs = list.getFirst();
                    if (mhs != null) mhs.tampil();
                }
                case 11 -> {
                    Mahasiswa15 mhs = list.getLast();
                    if (mhs != null) mhs.tampil();
                }
                case 12 -> {
                    System.out.print("Masukkan indeks yang ingin dilihat: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa15 mhs = list.getIndex(index);
                    if (mhs != null) mhs.tampil();
                }
                case 13 -> System.out.println("Jumlah data dalam list: " + list.size());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa15 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa15(nim, nama, kelas, ipk);
    }
}
