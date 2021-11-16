package ua.parkavenue.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DefaultPage extends AbstractPage{
    private final static By logo = By.xpath("//span/img[@alt='Park Avenue']");
    private final static By menuCategories1 = By.xpath("//li[@id='menu-item-new']");
    private final static By menuCategories2 = By.xpath("//li[@id='menu-item-shoes']");
    private final static By menuCategories3 = By.xpath("//li[@id='menu-item-sale']");
    private final static By koshik = By.xpath("//span[text()='Кошик']");
    private final static By koshikHeader = By.xpath("//div[@class='max-12 desktop-12 tablet-6 mobile-3 min-3']/h1");
    private final static By timetable = By.xpath("//p[text()='ПН-СБ – 10:00 - 19:00, НД – Вихідний']");
    private final static By name = By.xpath("//input[@id='input-name']");

    public DefaultPage (WebDriver driver) {
        super(driver);
    }
    public WebElement getLogoElement () {
        return driver.findElement(logo);
    }
    public WebElement getMenuCategories1Element () {
        return driver.findElement(menuCategories1);
    }
    public WebElement getMenuCategories2Element () {
        return driver.findElement(menuCategories2);
    }
    public WebElement getMenuCategories3Element () {
        return driver.findElement(menuCategories3);
    }
    public WebElement getKoshikElement () {
        return driver.findElement(koshik);
    }
    public WebElement getKoshikHeaderElement () {
        return driver.findElement(koshikHeader);
    }
    public WebElement getTimetableElement () {
        return driver.findElement(timetable);
    }
    public WebElement getNameElement () {
        return driver.findElement(name);
    }

}
