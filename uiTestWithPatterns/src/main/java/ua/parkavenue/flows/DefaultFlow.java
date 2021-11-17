package ua.parkavenue.flows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.parkavenue.pages.DefaultPage;

public class DefaultFlow {
    private DefaultPage defaultPage;
    public DefaultFlow (WebDriver driver) {
        this.defaultPage = new DefaultPage(driver);
    }

    public WebElement findLogo () {
        return defaultPage.getLogoElement();
    }

    public WebElement checkMenuCategories1 () {
        return defaultPage.getMenuCategories1Element();
    }

    public WebElement checkMenuCategories2 () {
        return defaultPage.getMenuCategories2Element();
    }

    public WebElement checkMenuCategories3 () {
        return defaultPage.getMenuCategories3Element();
    }

    public void clickKoshik () {
       defaultPage.getKoshikElement().click();
    }

    public WebElement headerKoshik () {
        return defaultPage.getKoshikHeaderElement();
    }

    public  WebElement checkTimetable () {
       return defaultPage.getTimetableElement();
    }

    public WebElement inputName () {
        defaultPage.getNameElement().click();
        defaultPage.getNameElement().sendKeys("Name");
        return defaultPage.getNameElement();
    }

}
