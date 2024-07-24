package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

        public class StudentsPage {
        WebDriver driver;

        public StudentsPage(){
        this.driver = Driver.getDriver();
           PageFactory.initElements(driver, this);
        }

@FindBy (xpath = "//button[contains(text(), \"Add student\")]")
    public WebElement addStudent;




        @FindBy (xpath = "//input[@name=\"name\"]")
        public WebElement firstNameInput;


        @FindBy(xpath = "//input[@name=\"lastName\"]")
        public WebElement lastNameInput;


        @FindBy(className = "css-6vwzer")
        public WebElement phoneNumInput;


        @FindBy(xpath = "//input[@name=\"email\"]")
        public WebElement emailInput;


        @FindBy (id = "mui-component-select-groupId")
        public WebElement groupSelect;

        @FindBy (xpath = "//li[contains(text(), 'Test')]")
        public WebElement testGroup;


        @FindBy(id = "mui-component-select-studyFormat")
        public WebElement studyFormat;


        @FindBy(xpath = "//li[contains(text(), 'OFFLINE')]")
        public WebElement offlineFormat;

        @FindBy(xpath = "//button[@type=\"submit\"]")
        public WebElement addB8t;

        @FindBy(xpath = "//table//tbody//tr[1]/td[2]")
            public WebElement nameOfAddedStud;

        @FindBy (xpath = "//button[text()='Cancel']")
            public WebElement cancelB8t;
}
