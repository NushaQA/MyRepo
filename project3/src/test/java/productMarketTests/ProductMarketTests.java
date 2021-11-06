package productMarketTests;
import org.testng.annotations.Test;
import product.Product;
import product.ProductMarket;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ProductMarketTests {

    @Test(dataProvider = "allprices", groups = {"prices"})
    public void testGetAllPrice(List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPrice(), expectedProducts);
    }

    @Test(dataProvider = "positiveprices", groups = {"prices"})
    public void testGetAllPricesPositive(List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllPricePositive(), expectedProducts);
    }

    @Test(dataProvider = "allnames", groups = {"names"})
    public void testGetAllName(List<Product> products, List<Integer> expectedProducts) {
        ProductMarket actual = new ProductMarket(products);
        assertEquals(actual.getAllName(), expectedProducts);
    }

    @DataProvider(name = "allprices")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                             Arrays.asList(14,-15,10)},
        };
    }

    @DataProvider(name = "positiveprices")
    public static Object[][] createData1() {
        return new Object[][]{
                new Object[]{Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList(14,10)},
        };
    }

    @DataProvider(name = "allnames")
    public static Object[][] createData2() {
        return new Object[][]{
                new Object[]{Arrays.asList(new Product(14, "Product1"), new Product (-15, "Product2"), new Product (10, "Product3")),
                        Arrays.asList("Product1","Product2","Product3")},
        };
    }



}
