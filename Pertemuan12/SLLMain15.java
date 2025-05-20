package Pertemuan12;

public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);
        Mahasiswa15 mhs2 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs3 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);
        Mahasiswa15 mhs4 = new Mahasiswa15("24212200", "Alvaro", "1A", 4.0);

        // sll.print();

        sll.addFirst(mhs1);
        // sll.print();

        sll.addLast(mhs4);
        // sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(1, mhs2);
        // sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();

    }
}
