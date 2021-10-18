package J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        //Map <String, Integer> map = new HasMap<>();
        //map.entrySet().stream().filter();

        List<Product> numbers = new ArrayList<>();
        numbers.add (new Product(10));
        numbers.add (new Product(11));
        numbers.add (new Product(12));
        List<String> str = numbers
                .stream()
                .filter(product -> product.getPrice()<0&&product.getPrice()<20)
                .map (product -> Integer.toString(product.getPrice()))
                .collect(Collectors.toList());

        List<Product> t = numbers
                .stream()
                .filter(product-> product.getPrice()<0)
                .collect(Collectors.toList());
        t.forEach(System.out::println);

        boolean anym = numbers
                .stream()
                .anyMatch(product -> product.getPrice()<0);

        System.out.println(anym);

        Optional<Product> prod = numbers
                .stream()
                .filter(product -> product.getPrice()<0)
                .findFirst();
        prod.ifPresent((System.out::println));
        boolean io = prod.isPresent();
        Product p = prod.orElse(new Product(10));
        System.out.println(p);

        Product p1 = prod.get();
        System.out.println(p1);
    }
}
