package view;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        Double baseSalary = Double.parseDouble(sc.nextLine());

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker?");
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i<n; i++){
            System.out.println("Enter contract #" + i + 1 + "data: ");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.nextLine());
            System.out.println("Value per hour: ");
            Double valuePerHour = Double.parseDouble(sc.nextLine());
            System.out.println("Duration (hour)");
            int hours = Integer.parseInt(sc.nextLine());

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}