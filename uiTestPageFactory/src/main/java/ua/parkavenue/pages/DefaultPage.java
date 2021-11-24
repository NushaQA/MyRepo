package ua.parkavenue.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefaultPage extends AbstractPage{
    @FindBy(xpath = "//span/img[@alt='Park Avenue']")
    private WebElement logo;

    @FindBy(xpath = "//li[@id='menu-item-new']")
    private WebElement menuCategories1;

    @FindBy(xpath = "//li[@id='menu-item-shoes']")
    private WebElement menuCategories2;

    @FindBy(xpath = "//li[@id='menu-item-bags']")
    private WebElement menuCategories3;

    @FindBy(xpath = "//a[@href ='/shop/cart/']")
    private WebElement koshik;

    @FindBy(xpath = "//div[@class='max-12 desktop-12 tablet-6 mobile-3 min-3']/h1")
    private WebElement koshikHeader;

    @FindBy(xpath = "//div[@id= 'cpac4']//p[contains(text(), '10:00 - 19:00')]")
    private WebElement timetable;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement name;

    public DefaultPage (WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoElement () {
        return logo;
    }

    public WebElement getMenuCategories1Element () {
        return menuCategories1;
    }

    public WebElement getMenuCategories2Element () {
        return menuCategories2;
    }

    public WebElement getMenuCategories3Element () {
        return menuCategories3;
    }

    public WebElement getKoshikElement () {
        return koshik;
    }

    public WebElement getKoshikHeaderElement () {
        return koshikHeader;
    }

    public WebElement getTimetableElement () {
        return timetable;
    }

    public WebElement getNameElement () {
        return name;
    }

}
