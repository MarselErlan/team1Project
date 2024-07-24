package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.loginPage;
import utilities.Driver;

public class loginTest {
    loginPage loginpage = new loginPage();

    @Test
    public void testLoginResults(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://batch-6.studymate.us/login");

        loginpage.testLogin("admin@codewise.com","codewise123","English");



    }
}
