import java.util.*;

class UltimoElemento {
    public static void UltimoElemento(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(seqNum[i]);
        }
        int j = v.length - 1;
        v = insereUltimo(v,j);
        System.out.println(Arrays.toString(v));
    }
    public static int[] insereUltimo(int[]v, int j){
        while (j > 0 && v[j] < v[j - 1]) {
            swap(v, j);
            j--;
        }
        return v;
    }
    public static void swap(int[]v, int j){
        int aux = v[j];
        v[j] = v[j-1];
        v[j-1] = aux;
    }
}