package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.CoursesPage;
import pages.LoginPage;
import utilities.Driver;

import java.time.Duration;

public class CoursesPageTests {

    CommonPage commonPage;
    CoursesPage coursesPage;
    LoginPage loginPage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        commonPage = new CommonPage();
        coursesPage = new CoursesPage();
        loginPage = new LoginPage();
        driver.get("https://batch-6.studymate.us/login");
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }

    @Test
    public void addCoursesTest() throws InterruptedException {
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        Thread.sleep(Duration.ofSeconds(3).toMillis());  // Using toMillis() for Thread.sleep
        commonPage.coursesPage.click();

        coursesPage.addCourseB8t.click();
        coursesPage.courseNameInput.sendKeys("CHECK CHECK");
        coursesPage.dateOfFinishInput.sendKeys("111124");
        coursesPage.descriptionInput.sendKeys("RANDOM TEXT");
        coursesPage.createB8t.click();

        driver.navigate().refresh();

        // Assert the course was added successfully
        Assert.assertEquals(coursesPage.newCourseName.getText(), "CHECK CHECK");
    }
}
