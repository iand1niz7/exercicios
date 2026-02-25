import java.util.ArrayList;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

class BST {
    private Node root;

    public BST(){
    	this.root = null;
    }

private class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    Node(int v){
        this.value = v;
	this.left = null;
	this.right =  null;
    }
}
public void insert(int value){
	root = inserir(root, value);
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

private int altura(Node n){
    if(n == null) return -1;

    int alturaEsq = altura(n.left);
    int alturaDir = altura(n.right);

    return 1 + Math.max(alturaEsq, alturaDir);
}

public int balance (Node n){
    if (n == null) return 0;
    
    return altura(n.left) - altura(n.right);
}
public void preOrderWithBalance(){
	preOrder(root);
}
public void preOrder(Node n){
    if(n != null){
    	System.out.println(n.value + "," + balance(n) + " ");
    	preOrder(n.left);
    	preOrder(n.right);
    
    	}
    }
}

public class BalanceArvore {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
	BST tree = new BST();

	String[] numeros = sc.nextLine().trim().split("\\s+");

        for(String num : numeros) {
            tree.insert(Integer.parseInt(num));
        }

        tree.preOrderWithBalance();
        System.out.println();

	sc.close();
    }	

} 
