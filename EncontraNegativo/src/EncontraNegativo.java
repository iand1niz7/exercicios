import java.util.Scanner;

public class EncontraNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(seqNum[i]);
        }
        String resultado = encontraNegativoRecursivo(v, 0);
        System.out.println(resultado);
    }
    public static String encontraNegativoRecursivo(int[]v, int i) {
        if(i >= v.length){
            return "-";
        }
        if (v[i] < 0){
            return String.valueOf(v[i]);
        }
        return encontraNegativoRecursivo(v, i + 1);
    }
}