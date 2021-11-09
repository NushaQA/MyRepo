import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        String baseUrl = "https://parkavenue.ua/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get (baseUrl);
        WebElement element = driver.findElement(By.xpath("//p[@id='cart']"));
        element.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
