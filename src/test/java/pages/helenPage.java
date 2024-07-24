package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class helenPage {

    WebDriver driver;
     public helenPage(){
         this.driver= Driver.getDriver();
         PageFactory.initElements(driver,this);
     }

    @FindBy(xpath = "//li[text()=\"Teachers\"]")
    public WebElement teachers;

    @FindBy(xpath = "//button[text()=\"Add teacher\"]")
    public WebElement addTeachersButton;

    @FindBy(id = ":r4:")
    public WebElement firstNameInput;

    @FindBy(id = ":ra:")
    public WebElement firstNameInput2;

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


    public void verifyMethod(String name ){
        List<WebElement> fullNames = Driver.getDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));
        List<String> addedName = new ArrayList<>();
        for(WebElement verifyNames : fullNames){
            addedName.add(verifyNames.getText());
        }
        Assert.assertTrue(addedName.contains(name));

    }

    @FindBy(xpath = "//a[@href=\"/admin/announcements\"]")
    public WebElement Announcement;

    @FindBy(xpath = "(//button[starts-with(@class,\"MuiButtonBase-root\")]//child::span)[1]")
    public WebElement addAnnouncement;

    @FindBy(xpath = "//textarea[@type=\"text\"]")
    public WebElement text;

    @FindBy(xpath = "//div[@id=\"mui-component-select-groups\"]")
    public WebElement groups;

    @FindBy(xpath = "//li[text()=\"Test\"]")
    public WebElement testOption;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement addAnnounceInfoButton;

    @FindBy(xpath = "//div[@class=\"css-q8s1he\"]/..")
    public WebElement information;

    @FindBy(xpath = "//button[text()=\"Cancel\"]")
    public WebElement cancelButton;







}
