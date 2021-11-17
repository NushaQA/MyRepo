import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import static ua.parkavenue.driver.WebDriverManager.getWebdriver;


public class AbstractTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        driver = getWebdriver();
    }

    @AfterAll
    public static void quitDriver(){
        driver.close();
        driver.quit();
    }
}
