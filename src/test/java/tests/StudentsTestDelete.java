package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import pages.StudentsDelete;
import utilities.Driver;

public class StudentsTestDelete {

    StudentsDelete students;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://batch-6.studymate.us/login");
        students = new StudentsDelete();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().close();
    }

    @Test
    public void StudentsTestingFunc() throws InterruptedException {
        // Login to the application
        students.login.sendKeys("admin@codewise.com");
        students.password.sendKeys("codewise123");
        students.loginBtn.click();

        // Assert that login was successful
        Assert.assertTrue(students.ChooseTeachers.isDisplayed(), "Login failed or Students page not visible.");

        // Navigate to the Students page
        students.ChooseTeachers.click();

        // Assert that the Students page is displayed
        Assert.assertTrue(students.ToremoveIndex1.isDisplayed(), "Students page is not displayed.");

        // Select a student to remove
        students.ToremoveIndex1.click();

        // Assert that the delete option is visible
        Assert.assertTrue(students.removeIndex1.isDisplayed(), "Delete option is not visible.");

        // Confirm removal
        students.removeIndex1.click();
        students.confirmRemove.click();

        // Wait for confirmation message
        Thread.sleep(200);

        // Assert that the student was successfully deleted
        String actualMessage = students.confirmSuccessfullyDeleted.getText();
        String expectedMessage = "Student successfully deleted";

        Assert.assertEquals(actualMessage, expectedMessage, "Student deletion message did not match.");
    }
}
