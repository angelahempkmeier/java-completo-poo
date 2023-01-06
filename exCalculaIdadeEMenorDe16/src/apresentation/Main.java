package apresentation;

import entities.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = Integer.parseInt(sc.nextLine());

        Person[] person = new Person[n];
        float averageHeight = 0;
        int isYounger = 0;

        for(int i = 0; i< person.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Altura: ");
            float height = Float.parseFloat(sc.nextLine());
            System.out.println("Idade: ");
            int age = Integer.parseInt(sc.nextLine());
            if(age < 16){
                isYounger++;
            }
            averageHeight += height;
            person[i] = new Person(name, height, age);

        }

        float per = ((float)isYounger/n)*100;

        System.out.println("Altura média: " + averageHeight/n);
        System.out.println("Pessoas mais novas que 16 anos: " + per +"%");

        for(int i = 0; i < isYounger; i++){
            if(person[i].getAge() < 16){
                System.out.println(person[i].getName());
            }
        }
        System.out.println();


    }
}