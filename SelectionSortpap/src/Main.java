import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] seqNum = sc.nextLine().split(" ");
    int[]v = new int[seqNum.length];

    for(int i = 0; i < v.length; i++){
        v[i] = Integer.parseInt(seqNum[i]);
    }
    selectionPassoaPasso(v);

}
    public static void selectionPassoaPasso(int[]v){

        for(int i = 0; i < v.length - 1; i++) {
            int indexMenor = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[indexMenor]) {
                    indexMenor = j;
                }
            }
            if(indexMenor > i) {
                swap(v, i, indexMenor);
                System.out.println(Arrays.toString(v));
            }
        }
    }
    public static void swap(int[]v, int j, int menor){
        int aux = v[j];
        v[j] = v[menor];
        v[menor] = aux;
    }
}