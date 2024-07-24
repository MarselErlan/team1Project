package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GroupsPage {
    WebDriver driver;

    public GroupsPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[text()='Create group']")
    public WebElement addGroupB8t;

    @FindBy (xpath = "//input[@name=\"name\"]")
    public WebElement groupNameInput;

    @FindBy(xpath = "//input[@name=\"dateOfFinish\"]")
    public WebElement dateOfGroup;

    @FindBy(xpath = "//textarea[@name=\"description\"]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement createGroupB8t;













}
