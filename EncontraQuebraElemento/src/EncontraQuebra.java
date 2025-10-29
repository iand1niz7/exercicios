import java.util.Scanner;

public class EncontraQuebra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v = new int[seqNum.length];

        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(seqNum[i]);
        }
        int resultado = encontraElementoQuebrado(v, 0);
        System.out.println(resultado);
        }
    public static int encontraElementoQuebrado(int[]v, int i ){
        if(i >= v.length - 1){
            return -1;
        }
        if(v[i + 1] < v[i]){
            return i + 1;
        }
        return encontraElementoQuebrado(v, i+1);
    }
}