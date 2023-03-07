package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));

        //forma 1: implementacao da interface
//        list.removeIf(new ProductPredicate());

//        //forma 2: reference metodo c metodo estatico
//        list.removeIf(Product::staticProductPredicate);

        //forma 3: reference method, n static
//        list.removeIf(Product::nonStaticProductPredicate);

        //forma 4: lambda declarada
//        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//        list.removeIf(pred);

        //forma 4: lambda inline
        list.removeIf(p -> p.getPrice() >= 100.0);


        for(Product p : list){
            System.out.println(p);
        }


    }
}