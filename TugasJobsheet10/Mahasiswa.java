package TugasJobsheet10;

public class Mahasiswa {
    String nim, nama, prodi, kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.printf("%s - %s - %s - %s\n", nim, nama, prodi, kelas);
    }
}
