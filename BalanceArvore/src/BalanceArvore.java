import java.util.Arraylist;
import java.util.Deque;
import java.util.LinkedList;

public class AVL {
    private Node root;
    private int size;

    public AVL(){
        this.size = -1;
    }

    public boolean isEmpty(){
        return this.root == null;
    }
}
public class Node {
    int value;
    int height;
    Node left;
    Node right;
    Node parent;

    Node(int v){
        this.height = 0;
        this.value = v;
    }
}

public Node inserir(Node root, int v){
    if(root == null) return new Node(v);

    if(v < root.v){
        root.left = inserir(root.left, v);
    
    } else if(v > root.v){
        root.right = inserir(root.right, v);
    }
    
    return root;
}

public int altura(Node n){
    if(n == null) return -1;

    int alturaEsq = altura(n.left);
    int alturaDir = altura(n.right);

    return 1 + Math.max(alturaEsq, AlturaDir);
}

public int balance (Node n){
    if (n == null) return 0;
    
    return altura(n.left) - altura(n.right);
}

public void preOrderBalance(Node n){
    if(n == null){
        System.out.println(n.value + "," + balance(n));
    }
    preOrderBalance(n.left);

    preOrderBalance(n.right);

}

class BalanceArvore {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Node raiz = null;

        while(sc.hasNextInt()){
            int valor = sc.nextInt();
            raiz = inserir(raiz, valor);
        }

        preOrderBalance(raiz);
        sc.close();
    }
} 
