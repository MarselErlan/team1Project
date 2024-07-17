
package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.CoursesPage;
import pages.LoginPage;
import utilities.Driver;

import java.time.Duration;

public class CoursesPageTests {

    CommonPage commonPage = new CommonPage();
    CoursesPage coursesPage = new CoursesPage();
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Test
    public void addCoursesTest() throws InterruptedException {
        driver.get("https://batch-6.studymate.us/login");
        loginPage.testLogin("admin@codewise.com","codewise123","English");
        loginPage.loginButton.click();

        Thread.sleep(Duration.ofSeconds(3));
        commonPage.coursesPage.click();

        coursesPage.addCourseB8t.click();
        coursesPage.courseNameInput.sendKeys("CHECK CHECK");
        coursesPage.dateOfFinishInput.sendKeys("111124");
        coursesPage.descriptionInput.sendKeys("RANDOM TEXT");
        coursesPage.createB8t.click();

        driver.navigate().refresh();

        Assert.assertEquals("CHECK CHECK", coursesPage.newCourseName.getText());





    }



}

