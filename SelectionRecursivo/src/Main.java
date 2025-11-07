import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(seqNum[i]);
        }
        selectionRecursivo(v, 0);
    }
    public static int[] selectionRecursivo(int[]v, int inicio) {
        if (inicio >= v.length - 1) {
            return v;
        }
        int indexMenor = inicio;
        for (int j = inicio; j < v.length; j++) {
            if (v[j] < v[indexMenor]) {
               indexMenor = j;
            }
        }
        if(indexMenor != inicio){
            int aux = v[inicio];
            v[inicio] = v[indexMenor];
            v[indexMenor] = aux;
        }
        System.out.println(Arrays.toString(v));
        return selectionRecursivo(v, inicio + 1);
    }
}
