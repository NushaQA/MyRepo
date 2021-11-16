import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class SmokeTest extends AbstractTest {

    @BeforeEach
    public void manageDriver(){
        driver.manage().window().maximize();
        //driver.get (System.getProperty("baseUrl"));
        driver.get ("https://parkavenue.ua/");
    }

   @Test
    public void findLogo () throws InterruptedException  {
        WebElement element = driver.findElement(By.xpath("//span/img[@alt='Park Avenue']"));
        Thread.sleep(3000);
        assertTrue(element.isDisplayed());
    }

    @Test
     public void checkMenuCategories () throws InterruptedException {
         WebElement element1 = driver.findElement(By.xpath("//li[@id='menu-item-new']"));
         WebElement element2 = driver.findElement(By.xpath("//li[@id='menu-item-shoes']"));
         WebElement element3 = driver.findElement(By.xpath("//li[@id='menu-item-sale']"));
         Thread.sleep(3000);
         assertAll(
                 ()-> assertTrue(element1.isDisplayed()),
                 ()-> assertTrue(element2.isDisplayed()),
                 ()-> assertTrue(element3.isDisplayed()));
     }

     @Test
     public void clickAndCheckKoshik () throws InterruptedException  {
         WebElement element = driver.findElement(By.xpath("//span[text()='Кошик']"));
         Thread.sleep(3000);
         element.click();
         element = driver.findElement(By.xpath("//div[@class='max-12 desktop-12 tablet-6 mobile-3 min-3']/h1"));
         assertTrue(element.isDisplayed());
     }

     @Test
     public void checkTimetable () throws InterruptedException  {
         WebElement element = driver.findElement(By.xpath("//p[text()='ПН-СБ – 10:00 - 19:00, НД – Вихідний']"));
         Thread.sleep(3000);
         assertEquals(element.getText(), "ПН-СБ – 10:00 - 19:00, НД – Вихідний");
     }

     @Test
     public void inputName () throws InterruptedException  {
         WebElement element = driver.findElement(By.xpath("//input[@id='input-name']"));
         Thread.sleep(3000);
         element.click();
         element.sendKeys("Anna");
         Thread.sleep(3000);
         assertEquals(element.getAttribute("value"), "Anna");
     }

}
