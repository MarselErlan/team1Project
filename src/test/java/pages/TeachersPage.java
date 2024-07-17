package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeachersPage {

    WebDriver driver;
    public TeachersPage(){
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[text()=\"Teachers\"]")
    public WebElement teachers;

    @FindBy(xpath = "//button[text()=\"Add teacher\"]")
    public WebElement addTeachersButton;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name=\"phoneNumber\"]")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name=\"specialization\"]")
    public WebElement specilizationInput;

    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
    public WebElement chooseCourseInput;

    @FindBy(xpath ="(//input[@type=\"checkbox\"])[4]")
    public WebElement testCourse;


    @FindBy(xpath = "//button[text()=\"Add\"]")
    public WebElement addButton;



    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement login;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium sc-fEXmlR lbeKCy css-79mk38\"]")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[text()='Teachers']")
    public WebElement chooseTeachers;

    @FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[1]")
    public WebElement toremoveIndex1;

    @FindBy(xpath = "(//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-l5jx0u\" and @tabindex=\"-1\"])[1]")
    public WebElement removeIndex1;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium sc-eKJbhj iZsItr css-fab8xs\"]")
    public WebElement confirmRemove;

    @FindBy(xpath = "//p[text()='Instructor successfully deleted']")
    public WebElement confirmSuccessfullyDeleted;





}

