package Pertemuan13;

import java.util.Scanner;

public class DLLMain15 {
    public static void main(String[] args) {
        DoubleLinkedList15 list = new DoubleLinkedList15();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
    System.out.println("\nMenu Double Linked List Mahasiswa");
    System.out.println("1. Tambah di awal");
    System.out.println("2. Tambah di akhir");
    System.out.println("3. Sisipkan setelah NIM tertentu");
    System.out.println("4. Hapus di awal");
    System.out.println("5. Hapus di akhir");
    System.out.println("6. Tampilkan data");
    System.out.println("7. Cari Mahasiswa berdasarkan NIM");
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
                System.out.print("Masukkan NIM yang dicari: ");
                String key = scan.nextLine();
                Mahasiswa15 mhs = inputMahasiswa(scan);
                list.insertAfter(key, mhs);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> list.print();
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node15 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }

    private static Mahasiswa15 inputMahasiswa(Scanner scan) {
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