package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class TrashPage {
    private final Actions actions;
    private final WebDriverWait wait;
    WebDriver driver;

    public TrashPage() {
        driver = Driver.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
    }

    @FindBy(xpath = "//li[text()='Trash']")
    public WebElement trashButton;

    @FindBy(xpath = "(//table//td[3]//*[local-name()='svg']//*[local-name()='g'])[1]")
    public WebElement trashDelete;

    @FindBy(xpath = "(//table//td[3]//*[local-name()='svg'])[1]")
    public WebElement buttonRecovered;

    public void click55() {
        trashButton.click();
        trashDelete.click();
        buttonRecovered.click();
    }
}
