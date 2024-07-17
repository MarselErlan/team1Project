package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.TeachersPage;
import utilities.Driver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;




public class TeachersPageTest {

    TeachersPage teachers;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://batch-6.studymate.us/login");
        teachers = new TeachersPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }



    TeachersPage teachersPage = new TeachersPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void testAddTeachers(){

        WebDriver driver = Driver.getDriver();
        driver.get("https://batch-6.studymate.us/login");
        loginPage.testLogin("admin@codewise.com","codewise123","English");

        teachersPage.teachers.click();
        teachersPage.addTeachersButton.click();
        teachersPage.firstNameInput.sendKeys("Mary");
        teachersPage.lastNameInput.sendKeys("Jan");
        teachersPage.phoneNumberInput.click();
        teachersPage.phoneNumberInput.sendKeys("224456789");
        teachersPage.emailInput.sendKeys("mary.jan@gmail.com");
        teachersPage.specilizationInput.sendKeys("IT support");
        teachersPage.chooseCourseInput.click();
        teachersPage.testCourse.click();
//        SeleniumUtilities.waitForSeconds(2);
        Actions actions = new Actions(driver);
        actions.moveByOffset(0,20).click(teachersPage.firstNameInput).build().perform();
        teachersPage.addButton.click();



    }





        @Test
        public void TeachersTestingFunc() throws InterruptedException {
            // Login to the application
            teachers.login.sendKeys("admin@codewise.com");
            teachers.password.sendKeys("codewise123");
            teachers.loginBtn.click();

            // Assert that login was successful
            Assert.assertTrue(teachers.chooseTeachers.isDisplayed(), "Login failed or Teachers page not visible.");

            // Navigate to the Teachers page
            teachers.chooseTeachers.click();

            // Assert that the Teachers page is displayed
            Assert.assertTrue(teachers.toremoveIndex1.isDisplayed(), "Teachers page is not displayed.");

            // Select a teacher to remove
            teachers.toremoveIndex1.click();

            // Assert that the delete option is visible
            Assert.assertTrue(teachers.removeIndex1.isDisplayed(), "Delete option is not visible.");

            // Confirm removal
            teachers.removeIndex1.click();
            teachers.confirmRemove.click();

            // Wait for confirmation message
            Thread.sleep(100);

            // Assert that the teacher was successfully deleted
            String actualMessage = teachers.confirmSuccessfullyDeleted.getText();
            String expectedMessage = "Instructor successfully deleted";

            Assert.assertEquals(actualMessage, expectedMessage, "Instructor deletion message did not match.");
        }
}









