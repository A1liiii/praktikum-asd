public class BinaryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();

        Mahasiswa15 mhs1 = new Mahasiswa15("244160121", "Ali", "A", 3.57);
        Mahasiswa15 mhs2 = new Mahasiswa15("244160185", "Candra", "C", 3.41);
        Mahasiswa15 mhs3 = new Mahasiswa15("244160221", "Badar", "B", 3.75);
        Mahasiswa15 mhs4 = new Mahasiswa15("244160220", "Dewi", "B", 3.35);
        Mahasiswa15 mhs5 = new Mahasiswa15("244160131", "Devi", "A", 3.48);
        Mahasiswa15 mhs6 = new Mahasiswa15("244160205", "Ehsan", "D", 3.61);
        Mahasiswa15 mhs7 = new Mahasiswa15("244160170", "Fizi", "B", 3.86);

        Mahasiswa15[] dataMahasiswas = {
            mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null
        };

        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nTraversal PreOrder Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
