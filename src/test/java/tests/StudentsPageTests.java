package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.loginPage;
import pages.StudentsPage;
import utilities.Driver;

import java.time.Duration;

public class StudentsPageTests {

WebDriver driver = Driver.getDriver();
StudentsPage studentsPage =new StudentsPage();
CommonPage commonPage = new CommonPage();
pages.loginPage loginPage = new loginPage();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));





    @Test
    public void addStudent() throws InterruptedException {
        driver.get("https://batch-6.studymate.us/login");
        loginPage.testLogin("admin@codewise.com","codewise123","English");

        loginPage.loginButton.click();
        Thread.sleep(Duration.ofSeconds(2));
        commonPage.studentsPage.click();

        studentsPage.addStudent.click();
        studentsPage.firstNameInput.sendKeys("Azizbek");
        studentsPage.lastNameInput.sendKeys("Usman");
        studentsPage.phoneNumInput.click();
        studentsPage.phoneNumInput.sendKeys("3316885497");
        studentsPage.emailInput.sendKeys("azizusmanuulu@gmail.com");
        studentsPage.groupSelect.click();
        studentsPage.testGroup.click();
        studentsPage.studyFormat.click();
        studentsPage.offlineFormat.click();

        studentsPage.addB8t.click();


        driver.navigate().refresh();

        Assert.assertEquals("Azizbek Usman", studentsPage.nameOfAddedStud.getText());

        studentsPage.cancelB8t.click();
    }




}
