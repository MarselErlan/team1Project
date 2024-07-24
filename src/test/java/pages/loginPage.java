package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage {
    WebDriver driver;
    public loginPage(){
        this.driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@autocomplete=\"current-password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name=\"language\"]")
    public WebElement languageInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginButton;

    public void testLogin(String email, String password, String language){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        languageInput.sendKeys(language);
        loginButton.click();

    }
}
