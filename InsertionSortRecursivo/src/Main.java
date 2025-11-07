import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(seqNum[i]);
        }

        sortRecursivo(v, v.length);
    }

    public static int[] sortRecursivo(int[] v, int j) {
        if (j <= 1)
            return v;
        sortRecursivo(v, j - 1);
        int fim = v[j - 1];
        int i = j - 2;

        while (i >= 0 && v[i] > fim) {
            v[i + 1] = v[i];
            i--;
        }
        v[i + 1] = fim;
        if(j < v.length){
            System.out.println(Arrays.toString(v));
        }
        if(j == v.length){
            System.out.println(Arrays.toString(v));
        }
        return v;
    }
}