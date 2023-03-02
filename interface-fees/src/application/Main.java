package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Data: ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = Double.parseDouble(sc.nextLine());

        Contract contract = new Contract(number, data, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = Integer.parseInt(sc.nextLine());

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }




    }
}