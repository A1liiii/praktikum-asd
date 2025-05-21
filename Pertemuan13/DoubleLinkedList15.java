package Pertemuan13;

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
}