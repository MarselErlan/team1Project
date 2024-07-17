package tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.TrashPage;
import utilities.Driver;

public class TrashTests {

    TrashPage trashPage = new TrashPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void click2() throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://batch-6.studymate.us/login");

        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        Thread.sleep(2000);
        trashPage.trashButton.click();

//        Thread.sleep(2000);
//        trashPage.buttonRecovered.click();

        Thread.sleep(2000);
        trashPage.trashDelete.click();









    }
}