import java.util.*;
import java.util.Scanner;

class RotacoesBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            BST tree = new BST();
            String line = sc.nextLine();
            if (!line.trim().isEmpty()) {
                String[] input = line.split(" ");
                for (String s : input) {
                    tree.insert(Integer.parseInt(s));
                }
                tree.balancearArvore();
            }
            sc.close();
        }
    }
    public static class BST {
        private Node root;

        public BST() {
            this.root = null;
        }

        private class Node {
            int value;
            int height;
            Node left;
            Node right;

            Node(int v) {
                this.value = v;
                this.left = null;
                this.right = null;
                this.height = 0;
            }
        }

        private Node inserir(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }
            if (value < root.value) {
                root.left = inserir(root.left, value);

            } else if (value > root.value) {
                root.right = inserir(root.right, value);
            }

            return root;
        }

        public void insert(int value) {
            root = inserir(root, value);
        }

        public int altura(Node n) {
            if (n == null) return -1;
            return 1 + Math.max(altura(n.left), altura(n.right));
        }

        public int balance(Node n) {
            if (n == null) return 0;
            return altura(n.left) - altura(n.right);
        }

        public void imprimirPreOrdem() {
            List<String> values = new ArrayList<>();
            preOrdem(root, values);
            System.out.println("[" + String.join(", ", values) + "]");
        }

        private void preOrdem(Node node, List<String> values) {
            if (node != null) {
                values.add(String.valueOf(node.value));
                preOrdem(node.left, values);
                preOrdem(node.right, values);
            }
        }
        public Node rotateRight(Node n) {
            System.out.println("rot_dir(" + n.value + ")");
            Node pivot = n.left;
            n.left = pivot.right;
            pivot.right = n;
            return pivot;
        }

        public Node rotateLeft(Node n) {
            System.out.println("rot_esq(" + n.value + ")");
            Node pivot = n.right;
            n.right = pivot.left;
            pivot.left = n;
            return pivot;
        }

        public void balancearArvore() {
            int bal = balance(root);

            if(bal > 1){
                if(balance(root.left) < 0){
                    root.left = rotateLeft(root.left);
                    imprimirPreOrdem();
                }
                root = rotateRight(root);
                imprimirPreOrdem();
            }
            else if(bal < -1){
                if(balance(root.right) > 0){
                    root.right = rotateRight(root.right);
                    imprimirPreOrdem();
                }
                root = rotateLeft(root);
                imprimirPreOrdem();
            }
            else{
                System.out.println("balanceada");
            }
        }
    }
}
