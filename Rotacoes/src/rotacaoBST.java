import java.util.Scanner;
class rotacaoBST{
    public static void main(String[] args){
    }
    
    public class BST {
        private node root;

        public BST(){
            this.root = null;
        }
    }

    private class Node{
        int value;
        Node left;
        Node right;
        Node parent;

        Node(int v){
            this.value = v;
            this.left = null;
            this.right = null;
        }
    }
    private Node inserir(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.value){
            root.left = inserir(root.left, value);
        
        } else if(value > root.value){
            root.right = inserir(root.right, value);
        }

        return root;
    }
    public void insert(int value){
        root = inserir(root, value);
    }
}
