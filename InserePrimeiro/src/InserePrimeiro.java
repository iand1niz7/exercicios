import java.util.Arrays;
import java.util.Scanner;

class InserePrimeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(seqNum[i]);
        }
        v = primeiroElemento(v);
        System.out.println(Arrays.toString(v));
    }
    public static int[] primeiroElemento(int[]v) {
        for (int i = 1; i < v.length; i++) {
            int j = i;
            while (j > 0 && v[j] < v[j - 1]) {
                swap(v, i);
                j-= 1;
            }
        }
        return v;
    }
    public static void swap(int[]v, int i){
        int aux = v[i];
        v[i] = v[i - 1];
        v[i - 1] = aux;
    }
}