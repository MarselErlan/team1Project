package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {
    WebDriver driver;

    public CommonPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//li[text()='Groups']")
    public WebElement groupsPage;

    @FindBy (xpath = "//li[text()='Courses']")
    public WebElement coursesPage;

    @FindBy (xpath = "//li[contains(text(), 'Students')]")
    public WebElement studentsPage;

    @FindBy(xpath = "//li[text()='Teachers']")
    public WebElement teachersPage;

    @FindBy(xpath = "//li[text()='Announcements']")
    public WebElement announcementsPage;

    @FindBy (xpath = "//li[text()='Trash']")
    public WebElement trashPage;

    @FindBy(xpath = "//li[text()='Schedule']")
    public WebElement schedulePage;











}
