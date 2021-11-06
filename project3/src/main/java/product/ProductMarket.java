package product;

import java.util.*;
import java.util.stream.Collectors;


public class ProductMarket {

    List<Product> products;

    public ProductMarket(
            List<Product> products) {

        this.products = products;
    }

    public List<Product> getProducts() {

        return products;
    }

    public List<Integer> getAllPrice() {
        return products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllPricePositive() {
        return products.stream()
                .filter(x -> x.getPrice() > 0)
                .map(Product::getPrice)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllPriceNegative() {
        return products.stream()
                .filter(x -> x.getPrice() < 0)
                .map(Product::getPrice)
                .collect(Collectors.toList());
    }

    public List<String> getAllPriceAsString() {
        return products.stream()
                .map(Product::getPrice)
                .map(Objects::toString)
                .collect(Collectors.toList());
    }

    public List<String> getAllName() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllNameSorted() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .map(Product::getName)
                .collect(Collectors.toList());
    }

}
