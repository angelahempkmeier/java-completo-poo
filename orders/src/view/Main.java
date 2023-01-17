package view;

import entities.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Client client;


        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date: (DD/MM/YYYY)");
        Date birthDate = sdf.parse(sc.nextLine());
        client = new Client(nome, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?");
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            Double productPrice = Double.parseDouble(sc.nextLine());
            System.out.println("Quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItens(orderItem);

        }

        System.out.println(order);

    }
}