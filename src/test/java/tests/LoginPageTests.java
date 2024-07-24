package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class LoginPageTests {
    LoginPage loginPage = new LoginPage();

    @Test
    public void testLoginResults(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://batch-6.studymate.us/login");

        loginPage.testLogin("admin@codewise.com","codewise123","English");
        loginPage.loginButton.click();


    }





}
