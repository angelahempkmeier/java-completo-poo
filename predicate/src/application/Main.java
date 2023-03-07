package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));

        //forma 1: implementacao da interface
        list.removeIf(new ProductPredicate());
        
        for(Product p : list){
            System.out.println(p);
        }


    }
}