import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.parkavenue.flows.DefaultFlow;

import static org.junit.jupiter.api.Assertions.*;

public class TestDefaultPage extends AbstractTest {

    private DefaultFlow defaultFlow;

    @BeforeEach
    public void manageDriver(){
       defaultFlow = new DefaultFlow(driver) ;
       driver.manage().window().maximize();
       //driver.get ("https://parkavenue.ua/");
       driver.get (System.getProperty("baseUrl"));
    }

   @Test
    public void findLogo () throws InterruptedException  {
       assertTrue(defaultFlow.findLogo().isDisplayed());
       Thread.sleep(300);
    }

   @Test
     public void checkMenuCategories () throws InterruptedException {
        assertAll(
                 ()-> assertTrue(defaultFlow.checkMenuCategories1().isDisplayed()),
                 ()-> assertTrue(defaultFlow.checkMenuCategories2().isDisplayed()),
                 ()-> assertTrue(defaultFlow.checkMenuCategories3().isDisplayed()));
       Thread.sleep(300);
     }

     @Test
     public void clickAndCheckKoshik () throws InterruptedException  {
        defaultFlow.clickKoshik();
        Thread.sleep(300);
        assertTrue(defaultFlow.headerKoshik().isDisplayed());
     }

     @Test
     public void checkTimetable () throws InterruptedException  {
        //assertEquals(defaultFlow.checkTimetable().getText(), "ПН-СБ – 10:00 - 19:00, НД – Вихідний");
         assertTrue(defaultFlow.checkTimetable().isDisplayed());
        Thread.sleep(300);
     }

    @Test
     public void inputName () throws InterruptedException  {
         assertEquals(defaultFlow.inputName().getAttribute("value"), "Name");
         Thread.sleep(300);
     }
}
