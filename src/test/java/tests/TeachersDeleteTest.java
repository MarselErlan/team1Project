package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TeachersPage;
import utilities.Driver;

public class TeachersDeleteTest {
    TeachersPage teachersPage = new TeachersPage();

    @Test
    public void TeachersTestingFunc() throws InterruptedException {
        TeachersPage teachers = new TeachersPage();

        Driver.getDriver().get("https://batch-6.studymate.us/login");

        teachers.login.sendKeys("admin@codewise.com");
        teachers.password.sendKeys("codewise123");
        teachers.loginBtn.click();

        teachers.chooseTeachers.click();
        teachers.toremoveIndex1.click();
        teachers.removeIndex1.click();
        teachers.confirmRemove.click();
        Thread.sleep(100);

        Assert.assertEquals(teachers.confirmSuccessfullyDeleted.getText(), "Instructor successfully deleted");

    }






}