package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.helenPage;
import pages.loginPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class helenTest {

    loginPage loginpage = new loginPage();
    helenPage helenpage = new helenPage();




    @Test
    public void testAddTeachers() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://batch-6.studymate.us/login");
        loginpage.testLogin("admin@codewise.com","codewise123","English");
        Assert.assertTrue(helenpage.teachers.isDisplayed());
        helenpage.teachers.click();
        helenpage.addTeachersButton.click();
        helenpage.firstNameInput.sendKeys("Holly");
        helenpage.lastNameInput.sendKeys("Doe");
        helenpage.phoneNumberInput.click();
        helenpage.phoneNumberInput.sendKeys("2245557676");
        helenpage.emailInput.sendKeys("Holly.Doe@gmail.com");
        helenpage.specilizationInput.sendKeys("IT support");
        helenpage.chooseCourseInput.click();
        helenpage.testCourse.click();
        SeleniumUtils.waitForSeconds(2);
        Actions actions = new Actions(driver);
        actions.moveByOffset(0,20).click(helenpage.firstNameInput).build().perform();
        helenpage.addButton.click();
        Thread.sleep(6000);
        helenpage.verifyMethod("Holly Doe");




    }
    // negative test case
    @Test
    public void testNegativecase(){
        WebDriver driver = Driver.getDriver();

        helenpage.addTeachersButton.click();
        helenpage.firstNameInput2.sendKeys("Holly");
        helenpage.lastNameInput.sendKeys("Doe");
        helenpage.phoneNumberInput.click();
        helenpage.phoneNumberInput.sendKeys("2244678902");
        helenpage.emailInput.sendKeys("Holly.Doe");
        helenpage.specilizationInput.sendKeys("IT support");
        helenpage.chooseCourseInput.click();
        helenpage.testCourse.click();
        SeleniumUtils.waitForSeconds(2);
        Actions actions = new Actions(driver);
        actions.moveByOffset(0, 30).click(helenpage.firstNameInput2).build().perform();

        Assert.assertFalse(helenpage.addButton.isEnabled());

        helenpage.cancelButton.click();



    }

    @Test
    public void testAnnouncement() throws InterruptedException {

        helenpage.Announcement.click();
        Thread.sleep(3000);
        helenpage.addAnnouncement.click();
        helenpage.text.click();
        helenpage.text.sendKeys("Admin"+ Keys.ENTER);
        helenpage.groups.click();
        helenpage.testOption.click();
        helenpage.addAnnounceInfoButton.click();

        Assert.assertTrue(helenpage.information.isDisplayed());

    }

    // negative case for adding an announcement!
    @Test
    public void testAnnouncementNegative(){
        helenpage.addAnnouncement.click();
        helenpage.groups.click();
        helenpage.testOption.click();

        Assert.assertFalse(helenpage.addAnnounceInfoButton.isEnabled());




    }
}
