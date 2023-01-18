package view;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int employees = Integer.parseInt(sc.nextLine());
        List<Employee> employeeList = new ArrayList<>();

        for(int i = 0; i< employees; i++){
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.println("Outsourced employee? y/n");
            String os = sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = Integer.parseInt(sc.nextLine());
            System.out.println("Value per hour: ");
            Double valuePerHour = Double.parseDouble(sc.nextLine());
            if(os.equals("y")){
                System.out.println("Addiotinal charged: ");
                Double ac = Double.parseDouble(sc.nextLine());
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, ac);
                employeeList.add(employee);
            }else{
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }

        System.out.println("PAYMENTS:");
        for(Employee emp : employeeList){
            System.out.println(emp.getNome() + ": " + emp.payment());
        }
    }
}