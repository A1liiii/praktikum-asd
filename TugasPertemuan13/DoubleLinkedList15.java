package TugasPertemuan13;

public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;

    public DoubleLinkedList15() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node15 newNode = new Node15(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
        System.out.println("Linked list kosong.");
        } else {
            Node15 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong. Tidak ada data yang dihapus.");
            return;
        }

        System.out.print("Data yang terhapus adalah: ");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data sudah berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node15 search(String nim) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    public int size() {
        int count = 0;
        Node15 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }



    public void add(int index, Mahasiswa15 data) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks tidak valid. Penambahan gagal.");
            return;
        }


        if (index == 0) {
            addFirst(data);
        } else if (index == size()) {
            addLast(data);
        } else {
            Node15 newNode = new Node15(null, data, null);
            Node15 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void removeAfter(String key) {
        Node15 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Data tidak ditemukan atau tidak ada node setelahnya.");
        } else {
            Node15 toRemove = current.next;
            current.next = toRemove.next;
            if (toRemove.next != null) {
                toRemove.next.prev = current;
            } else {
                tail = current;
            }
            System.out.println("Data setelah " + key + " berhasil dihapus: " + toRemove.data.nim + " - " + toRemove.data.nama);
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks tidak valid. Penghapusan gagal.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size() - 1) {
            removeLast();
        } else {
            Node15 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data berhasil dihapus: " + current.data.nim + " - " + current.data.nama);
        }
    }

    public Mahasiswa15 getFirst() {
        if (head != null) {
            return head.data;
        } else {
            System.out.println("List kosong.");
            return null;
        }
    }

    public Mahasiswa15 getLast() {
        if (tail != null) {
            return tail.data;
        } else {
            System.out.println("List kosong.");
            return null;
        }
    }

    public Mahasiswa15 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        if (index < 0 || index >= size()) {
            System.out.println("Indeks di luar jangkauan.");
            return null;
        }
        Node15 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

}