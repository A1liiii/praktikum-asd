package TugasPertemuan12;

public class Queue15 {
    NodeMahasiswa15 front, rear;
    int size = 0;
    final int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(Mahasiswa15 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan.");
            return;
        }

        NodeMahasiswa15 newNode = new NodeMahasiswa15(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.println("Memanggil:");
            System.out.println("+------------+-------------------+-------------------+");
            System.out.printf("| %-10s | %-17s | %-17s |\n",
                    front.data.nim, front.data.nama, front.data.jurusan);
            System.out.println("+------------+-------------------+-------------------+");

            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            System.out.printf("+------------+-------------------+-------------------+\n");
            System.out.printf("| %-10s | %-17s | %-17s |\n",
                    front.data.nim, front.data.nama, front.data.jurusan);
            System.out.println("+------------+-------------------+-------------------+");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            System.out.printf("+------------+-------------------+-------------------+\n");
            System.out.printf("| %-10s | %-17s | %-17s |\n",
                    rear.data.nim, rear.data.nama, rear.data.jurusan);
            System.out.println("+------------+-------------------+-------------------+");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("+------------+-------------------+-------------------+");
        System.out.printf("| %-10s | %-17s | %-17s |\n", "NIM", "Nama", "Jurusan");
        System.out.println("+------------+-------------------+-------------------+");

        NodeMahasiswa15 temp = front;
        while (temp != null) {
            System.out.printf("| %-10s | %-17s | %-17s |\n",
                    temp.data.nim, temp.data.nama, temp.data.jurusan);
            temp = temp.next;
        }
        System.out.println("+------------+-------------------+-------------------+");
    }


    public int getSize() {
        return size;
    }
}