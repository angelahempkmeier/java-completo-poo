package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.println("Quantos alunos para o curso A?");
        int qtdadeA = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < qtdadeA; i++){
            int cod = Integer.parseInt(sc.nextLine());
            set.add(cod);
        }
        System.out.println("Quantos alunos para o curso B?");
        int qtadeB = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < qtadeB; i++){
            int cod = Integer.parseInt(sc.nextLine());
            set.add(cod);
        }
        System.out.println("Quantos alunos para o curso C?");
        int qtdadeC = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < qtdadeC; i++){
            int cod = Integer.parseInt(sc.nextLine());
            set.add(cod);
        }

        System.out.println("Total de estudantes: " + set.size());
    }
}