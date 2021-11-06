package productTests;
import org.testng.annotations.Test;
import product.Product;

import org.testng.annotations.DataProvider;

import static org.testng.AssertJUnit.assertEquals;

public class ProductTests {

    private Product product;


    @Test(dataProvider = "create", groups = {"testgetter"})
    public void testGetter(int price, String name, int expectedPrice, String expectedName) {
        product = new Product(price, name);
        assertEquals(expectedName, product.getName());
        assertEquals(expectedPrice, product.getPrice());
    }

    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{12, "Product1", 12, "Product1"},
                new Object[]{10, "Product2", 10, "Product2"}
        };
    }
}