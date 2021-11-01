package productTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import product.Product;
import product.ProductMarket;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductMarketTest {

    @DisplayName("Should extract all product prices")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider1")
    public void testGetAllPrice (List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPrice(), expectedProducts);
    }

    @DisplayName("Should extract only positive prices")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider2")
    public void testGetAllPricesPositive (List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPricePositive(), expectedProducts);
    }

    @DisplayName("Should extract only negative prices")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider3")
    public void testGetAllPricesNegative (List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPriceNegative(), expectedProducts);
    }

    @DisplayName("Should return all prices as String")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider4")
    public void testGetAllPricesAsString (List<Product> products, List<String> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPriceAsString(), expectedProducts);
    }

    @DisplayName("Should return all product names")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider5")
    public void testGetAllName (List<Product> products, List<String> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllName(), expectedProducts);
    }

    @DisplayName("Should return all product names alphabetized")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @MethodSource("ListProvider6")
    public void testGetAllNameSorted (List<Product> products, List<String> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllNameSorted(), expectedProducts);
    }

    static Stream<Arguments> ListProvider1() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList(14,-15,10)),
                Arguments.of(
                        Arrays.asList(new Product(-10, "Product4"), new Product (10, "Product5"), new Product (-10, "Product6")),
                        Arrays.asList(-10,10,-10)));
    }

    static Stream<Arguments> ListProvider2() {
        return Stream.of(
                Arguments.of(
                   Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                   Arrays.asList(14,10)),
                Arguments.of(
                    Arrays.asList(new Product(-10, "Product4"), new Product (10, "Product5"), new Product (-10, "Product6")),
                    Arrays.asList(10)));
    }

    static Stream<Arguments> ListProvider3() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList(-15)),
                Arguments.of(
                        Arrays.asList(new Product(-10, "Product4"), new Product (10, "Product5"), new Product (-10, "Product6")),
                        Arrays.asList(-10,-10)));
    }

    static Stream<Arguments> ListProvider4() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList("14", "-15", "10")),
                Arguments.of(
                        Arrays.asList(new Product(-10, "Product4"), new Product (10, "Product5"), new Product (-10, "Product6")),
                        Arrays.asList("-10","10","-10")));
    }

    static Stream<Arguments> ListProvider5() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList("Product1", "Product2", "Product3")),
                Arguments.of(
                        Arrays.asList(new Product(-10, "Product4"), new Product (10, "Product5"), new Product (-10, "Product6")),
                        Arrays.asList("Product4","Product5","Product6")));
    }

    static Stream<Arguments> ListProvider6() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(new Product(14, "Product3"), new Product (-15, "Product2"), new Product (10, "Product1")),
                        Arrays.asList("Product1", "Product2", "Product3")),
                Arguments.of(
                        Arrays.asList(new Product(-10, "DProduct"), new Product (10, "LProduct"), new Product (-10, "LAProduct")),
                        Arrays.asList("DProduct","LAProduct","LProduct")));
    }
}
