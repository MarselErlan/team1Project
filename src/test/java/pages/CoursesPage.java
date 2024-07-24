package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CoursesPage {

    WebDriver driver;

    public CoursesPage (){

        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//button[text()='Create course']")
    public WebElement addCourseB8t;

    @FindBy(name = "courseName")
    public WebElement courseNameInput;

    @FindBy(name = "dateOfFinish")
    public WebElement dateOfFinishInput;

    @FindBy(xpath = "//textarea[@name=\"description\"]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createB8t;

    @FindBy(xpath = "(//div[@class=\"MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom sc-fbYMXx efYSLH css-1i17kim\"])[1]")
    public WebElement newCourseName;










}
