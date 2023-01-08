import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int[][] mat = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.println();
        }

        int number = Integer.parseInt(sc.nextLine());
        int esquerda = 0, direita = 0, cima = 0, baixo = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == number){
                    esquerda = mat[i][j-1];
                    direita = mat[i][j+1];
                    cima = mat[i-1][j];
                    baixo = mat[i+1][j];
                }
            }
        }
        System.out.println("Number: " + number);
        System.out.println("Cima: " + cima + " Baixo: " + baixo + " Esquerda: " + esquerda + " Direita: " + direita);

    }
}