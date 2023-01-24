package apresentation;

import entities.Account;
import exceptions.DeuRuim;
import exceptions.SemSaldo;
import exceptions.ValorExcedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta: ");
        System.out.println("Número: ");
        Integer n = Integer.parseInt(sc.nextLine());
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Depósito inicial: ");
        Double di = Double.parseDouble(sc.nextLine());
        System.out.println("Limite de saque:");
        Double ls = Double.parseDouble(sc.nextLine());
        try {
            Account account = new Account(n, nome, di, ls);
            System.out.println("Entre com a quantidade para o saque: ");
            Double saque = Double.parseDouble(sc.nextLine());
            account.withdraw(saque);

        }catch (DeuRuim e){
            System.out.println("ERRO: " + e.getMessage());
        }catch(SemSaldo e){
            System.out.println("ERRO: " + e.getMessage());
        }catch (ValorExcedido e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}