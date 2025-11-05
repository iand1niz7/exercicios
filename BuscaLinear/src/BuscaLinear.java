import java.util.*;

class BuscaLinear {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] seqNum = sc.nextLine().split(" ");
        int[] v =  new int[seqNum.length];

        for(int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(seqNum[i]);
        }
        int input = sc.nextInt();
        int resultado = buscaLinearRecursiva(v, input, 0);
        System.out.println(resultado);

    }
    public static int buscaLinearRecursiva(int[] v, int input, int i){
        if(i >= v.length) {
            return -1;
        }
        if(v[i] ==  input) {
            return i;
        }
        return buscaLinearRecursiva(v, input, i +1);
    }
}