public class BinaryTree15 {
    public Node15 root;

    public BinaryTree15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa15 mahasiswa) {
        Node15 newNode = new Node15(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node15 current = root;
            Node15 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

        public void addRekursif(Mahasiswa15 data) {
        root = tambahRekursif(root, data);
    }

    private Node15 tambahRekursif(Node15 current, Mahasiswa15 data) {
        if (current == null) {
            return new Node15(data);
        }

        if (data.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, data);
        } else if (data.ipk > current.mahasiswa.ipk) {
            current.right = tambahRekursif(current.right, data);
        } else {
            System.out.println("Data dengan IPK " + data.ipk + " sudah ada.");
        }

        return current;
    }

    public Mahasiswa15 cariMinIPK() {
        Node15 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa15 cariMaxIPK() {
        Node15 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtasRekursif(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtasRekursif(Node15 node, double ipkBatas) {
        if (node != null) {
            // Traverse kiri terlebih dahulu
            tampilMahasiswaIPKdiAtasRekursif(node.left, ipkBatas);
            
            // Cek apakah IPK di atas batas
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }

            // Traverse kanan
            tampilMahasiswaIPKdiAtasRekursif(node.right, ipkBatas);
        }
    }


    public boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node15 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node15 getSuccessor(Node15 del) {
        Node15 successor = del.right;
        Node15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node15 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
