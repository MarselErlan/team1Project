package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TrashPage;
import utilities.Driver;

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

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }

    @Test
    public void click2() throws InterruptedException {
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        // Assert login was successful
        Thread.sleep(2000); // This should ideally be replaced with a proper wait
        Assert.assertTrue(trashPage.trashButton.isDisplayed(), "Login failed or trash button not displayed.");

        trashPage.trashButton.click();

        // Assert that the trash page is displayed
        Thread.sleep(2000); // This should ideally be replaced with a proper wait
        Assert.assertTrue(trashPage.trashDelete.isDisplayed(), "Trash page is not displayed or delete button not present.");

        trashPage.trashDelete.click();

        // Add assertions to verify that the trash delete action was successful
        // Adjust the locator and message to match your actual application
        Thread.sleep(2000); // This should ideally be replaced with a proper wait
        Assert.assertTrue(trashPage.buttonRecovered.isDisplayed(), "Delete action failed or recover button not displayed.");
    }
}
