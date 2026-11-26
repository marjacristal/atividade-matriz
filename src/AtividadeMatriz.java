public class AtividadeMatriz {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        matriz[0][0] = 8;
        matriz[0][1] = 15;
        matriz[0][2] = 14;
        matriz[1][0] = 3;
        matriz[1][1] = 29;
        matriz[1][2] = 20;
        matriz[2][0] = 25;
        matriz[2][1] = 6;
        matriz[2][2] = 7;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
