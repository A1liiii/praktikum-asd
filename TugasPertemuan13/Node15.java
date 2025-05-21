package TugasPertemuan13;

public class Node15 {
    Mahasiswa15 data;
    Node15 prev;
    Node15 next;

    public Node15(Node15 prev, Mahasiswa15 data, Node15 next) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public Node15(Mahasiswa15 data) {
    this.data = data;
    this.prev = null;
    this.next = null;
}
}