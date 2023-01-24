package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i<= n; i++){
            System.out.println("Product " + i + " data:");

        }


    }
}