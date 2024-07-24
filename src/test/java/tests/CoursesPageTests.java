package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.CoursesPage;
import pages.loginPage;
import utilities.Driver;

import java.time.Duration;

public class CoursesPageTests {

    CommonPage commonPage = new CommonPage();
    CoursesPage coursesPage = new CoursesPage();
    pages.loginPage loginPage = new loginPage();
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @AfterClass
    public static void close(){
        Driver.getDriver().close();
    }

    @Test
    public void addCoursesTest() throws InterruptedException {

//        driver.get("https://batch-6.studymate.us/login");
//        loginPage.testLogin("admin@codewise.com","codewise123","English");
//        loginPage.loginButton.click();

        Thread.sleep(2000);
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
