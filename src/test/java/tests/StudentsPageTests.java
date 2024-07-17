package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import pages.StudentsPage;
import utilities.Driver;

import java.time.Duration;

public class StudentsPageTests {

    WebDriver driver;
    StudentsPage studentsPage;
    CommonPage commonPage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        studentsPage = new StudentsPage();
        commonPage = new CommonPage();
        loginPage = new LoginPage();
        driver.get("https://batch-6.studymate.us/login");
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }

    @Test
    public void addStudent() throws InterruptedException {
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        // Wait for the login to complete
        Thread.sleep(Duration.ofSeconds(2).toMillis());

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

        // Wait for the student to be added and the page to refresh
        Thread.sleep(Duration.ofSeconds(2).toMillis());

        driver.navigate().refresh();

        // Assert that the student was added successfully
        Assert.assertEquals(studentsPage.nameOfAddedStud.getText(), "Azizbek Usman");
    }
}
