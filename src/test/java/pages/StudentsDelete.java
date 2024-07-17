package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentsDelete {

    WebDriver driver;

    public StudentsDelete(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement login;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium sc-fEXmlR lbeKCy css-79mk38\"]")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[text()='Students']")
    public WebElement ChooseTeachers;

    @FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[3]")
    public WebElement ToremoveIndex1;

    @FindBy(xpath = "(//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-l5jx0u\"])[3]")
    public WebElement removeIndex1;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement confirmRemove;

    @FindBy(xpath = "//p[text()='Student successfully deleted']")
    public WebElement confirmSuccessfullyDeleted;
}
