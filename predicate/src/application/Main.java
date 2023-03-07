package application;

import entities.Product;
import services.ProductService;
import util.ProductPredicate;
import util.UppercaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Tablet", 400.0));
        list.add(new Product("Mouse", 50.0));
/*
        forma 1: implementacao da interface
        list.removeIf(new ProductPredicate());

        forma 2: reference metodo c metodo estatico
        list.removeIf(Product::staticProductPredicate);

        forma 3: reference method, n static
        list.removeIf(Product::nonStaticProductPredicate);

        forma 4: lambda declarada
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);

        forma 5: lambda inline
        list.removeIf(p -> p.getPrice() >= 100.0 );

        CONSUMER, mesmas 5 formas, muito parecido, implementei só a ultima
        list.forEach( p -> p.setPrice(p.getPrice()*1.1));

        list.forEach(System.out::println);

        for(Product p : list){
            System.out.println(p);
        }
*/
        //MINHA FUNCAO
        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum: " + sum);





        //FUNCTION, tb 5 formas:
        List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}