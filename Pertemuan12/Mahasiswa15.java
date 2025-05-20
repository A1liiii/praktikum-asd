package Pertemuan12;

public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

public void tampilInformasi() {
    System.out.printf("%s\t%s\t%s\t%.1f\n", nama, nim, kelas, ipk);
}
}
