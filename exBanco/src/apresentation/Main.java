package apresentation;

import entities.Account;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter account number: ");
        int acc = Integer.parseInt(sc.nextLine());
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        Account account = new Account(acc, holder);

        System.out.println("Is there a initial deposite value? y/n");
        String resp = sc.nextLine();
        if(resp.equals("y")){
            System.out.println("Enter initial deposite value: ");
            float value = Float.parseFloat(sc.nextLine());
            account.deposito(value);
        }

        System.out.println("Account data: ");
        System.out.println(account.toString());

        System.out.println("Enter a deposite value: ");
        float dep = Float.parseFloat(sc.nextLine());
        account.deposito(dep);

        System.out.println("Update Account data: ");
        System.out.println(account.toString());

        System.out.println("Enter a withdraw value: ");
        float wd = Float.parseFloat(sc.nextLine());
        account.saque(wd);

        System.out.println("Update Account data: ");
        System.out.println(account.toString());



        System.out.println("Hello world!");
    }
}