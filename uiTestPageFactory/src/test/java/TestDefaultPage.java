import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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

    @Feature("Logo")
    @Description("Tests for finding logo")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void findLogo () throws InterruptedException  {
       assertTrue(defaultFlow.findLogo().isDisplayed());
    }

    @Feature("MenuCategories")
    @Description("Tests for checking menu categories presence")
    @Severity(SeverityLevel.NORMAL)
     @Test
     public void checkMenuCategories () throws InterruptedException {
        assertAll(
                 ()-> assertTrue(defaultFlow.checkMenuCategories1().isDisplayed()),
                 ()-> assertTrue(defaultFlow.checkMenuCategories2().isDisplayed()),
                 ()-> assertTrue(defaultFlow.checkMenuCategories3().isDisplayed()));
     }

    @Feature("Koshik")
    @Description("Tests for verifying koshik")
    @Severity(SeverityLevel.NORMAL)
     @Test
     public void clickAndCheckKoshik () throws InterruptedException  {
        defaultFlow.clickKoshik();
        assertTrue(defaultFlow.headerKoshik().isDisplayed());
     }

    @Feature("Timetable")
    @Description("Tests for checking timetable presence")
    @Severity(SeverityLevel.NORMAL)
     @Test
     public void checkTimetable () throws InterruptedException  {
        //assertEquals(defaultFlow.checkTimetable().getText(), "ПН-СБ – 10:00 - 19:00, НД – Вихідний");
         assertTrue(defaultFlow.checkTimetable().isDisplayed());
    }

    @Feature("Name input")
    @Description("Tests for verifying Name input")
    @Severity(SeverityLevel.NORMAL)
    @Test
     public void inputName () throws InterruptedException  {
         assertEquals(defaultFlow.inputName().getAttribute("value"), "Name");
     }
}
