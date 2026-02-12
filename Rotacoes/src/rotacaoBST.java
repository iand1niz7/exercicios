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
    public int altura(Node n){
    	if(n == null) return -1;
	int alturaEsq = altura (n.left);
	int alturaDir = altura (n.right);
	return 1 + Math.max(alturaEsq, alturaDir);	
    }
    public int balance (Node n){
    	if(n == null) return 0;
	return altura(n.left) - altura(n.right);
    }
    public Node rotateRight(Node n){
    	Node pivot = n.left;
	if(balance(n) > 1) {
	    pivot = n.parent;
	    n.parent = pivot.right;
	    pivot = parent;
	}
    }
}
