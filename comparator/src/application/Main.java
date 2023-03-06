package application;

import entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //forma 1, usar a classe MyComparator()
        list.sort(new MyComparator());

        for (Product p : list){
            System.out.println(p);
        }
    }
}