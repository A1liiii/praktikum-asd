package TugasPertemuan12;

public class Mahasiswa15 {
    String nim, nama, jurusan;
    
    public Mahasiswa15(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampil() {
        System.out.printf("%-10s %-15s %-15s\n", nim, nama, jurusan);
    }
}
