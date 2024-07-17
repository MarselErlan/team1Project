package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import pages.LoginPage;
import pages.TeachersPage;
import utilities.Driver;

public class TeachersPageTest {

    TeachersPage teachersPage;
    LoginPage loginPage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        teachersPage = new TeachersPage();
        loginPage = new LoginPage();
        driver.get("https://batch-6.studymate.us/login");
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }

    @Test
    public void testAddTeachers() {
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        // Assert login was successful
        Assert.assertTrue(teachersPage.teachers.isDisplayed(), "Login failed or Teachers page not displayed.");

        // Navigate to the teachers page and add a new teacher
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

        Actions actions = new Actions(driver);
        actions.moveByOffset(0, 20).click(teachersPage.firstNameInput).build().perform();
        teachersPage.addButton.click();

        // Assert the teacher was added successfully
        // Replace 'successMessage' with the actual WebElement that appears upon successful addition
        // Assert.assertTrue(teachersPage.successMessage.isDisplayed(), "Teacher was not added successfully.");
    }

    @Test
    public void testRemoveTeacher() throws InterruptedException {
        loginPage.testLogin("admin@codewise.com", "codewise123", "English");
        loginPage.loginButton.click();

        // Assert that login was successful
        Assert.assertTrue(teachersPage.chooseTeachers.isDisplayed(), "Login failed or Teachers page not visible.");

        // Navigate to the Teachers page
        teachersPage.chooseTeachers.click();

        // Assert that the Teachers page is displayed
        Assert.assertTrue(teachersPage.toremoveIndex1.isDisplayed(), "Teachers page is not displayed.");

        // Select a teacher to remove
        teachersPage.toremoveIndex1.click();

        // Assert that the delete option is visible
        Assert.assertTrue(teachersPage.removeIndex1.isDisplayed(), "Delete option is not visible.");

        // Confirm removal
        teachersPage.removeIndex1.click();
        teachersPage.confirmRemove.click();

        // Wait for confirmation message
        Thread.sleep(100);

        // Assert that the teacher was successfully deleted
        String actualMessage = teachersPage.confirmSuccessfullyDeleted.getText();
        String expectedMessage = "Instructor successfully deleted";

        Assert.assertEquals(actualMessage, expectedMessage, "Instructor deletion message did not match.");
    }
}
