package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TrashPage;
import utilities.Driver;

import java.time.Duration;

public class TrashTests {

    TrashPage trashPage;
    LoginPage loginPage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        trashPage = new TrashPage();
        loginPage = new LoginPage();
        driver.get("https://batch-6.studymate.us/login");

    }



    @Test
    public void click2() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();
        Assert.assertTrue(trashPage.trashButton.isDisplayed(), "Login failed or trash button not displayed");


        Thread.sleep(2000);
        trashPage.trashButton.click();
        Assert.assertTrue(trashPage.trashDelete.isDisplayed(), "Trash page is not displayed or delete button not present");

        Thread.sleep(2000);
        trashPage.trashDelete.click();
        Assert.assertTrue(trashPage.buttonRecovered.isDisplayed(), "Delete action failed or recover button not displayed");
    }
}
