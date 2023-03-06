package application;

import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        //forma 1, usar a classe MyComparator()
        //list.sort(new MyComparator());

        //forma 2, sintaxe de classe anônima
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//        list.sort(comp);

        //forma 3, menos verbosa, funcao lambda
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        list.sort(comp);




        for (Product p : list){
            System.out.println(p);
        }
    }
}