package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] antrian;
    int front, rear, size, max;

    int sudahKRS = 0;

    public AntrianKRS(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        front = rear = size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh.");
        } else {
            antrian[rear] = mhs;
            rear = (rear + 1) % max;
            size++;
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal harus ada 2 mahasiswa untuk proses KRS.");
        } else {
            System.out.println("Memproses KRS untuk:");
            for (int i = 0; i < 2; i++) {
                antrian[front].tampil();
                front = (front + 1) % max;
                size--;
                sudahKRS++;
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.print((i + 1) + ". ");
                antrian[idx].tampil();
            }
        }
    }

    public void lihatDepan() {
        if (!isEmpty()) {
            System.out.println("2 Mahasiswa Terdepan:");
            for (int i = 0; i < Math.min(2, size); i++) {
                int idx = (front + i) % max;
                antrian[idx].tampil();
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            int idx = (rear - 1 + max) % max;
            System.out.println("Antrian paling akhir:");
            antrian[idx].tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void kosongkan() {
        front = rear = size = 0;
        sudahKRS = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void cetakJumlah() {
        System.out.println("Jumlah Mahasiswa dalam Antrian: " + size);
    }

    public void cetakSudahKRS() {
        System.out.println("Jumlah Mahasiswa sudah KRS: " + sudahKRS);
    }

    public void cetakBelumKRS() {
        System.out.println("Jumlah Mahasiswa belum KRS: " + (30 - sudahKRS));
    }
}
