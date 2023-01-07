import entities.Pensao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos para alugar?");
        int n = Integer.parseInt(sc.nextLine());
        Pensao[] pensao = new Pensao[10];

        for(int i = 0; i<n;i++){
            System.out.println("Aluguel #" + i+1);
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int quarto = Integer.parseInt(sc.nextLine());
            pensao[quarto] = new Pensao(nome, email, quarto);
        }

        System.out.println("Informações de locação:");
        System.out.println();

        for(int i = 0; i<pensao.length;i++){
            if(pensao[i] != null){
                System.out.println(pensao[i]);
            }
        }


    }
}