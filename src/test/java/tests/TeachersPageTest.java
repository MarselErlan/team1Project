
package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.TeachersPage;
import utilities.Driver;

public class TeachersPageTest {
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

        if (teachers.confirmSuccessfullyDeleted.getText().equals("Instructor successfully deleted")) {
            System.out.println("Yes: " + teachers.confirmSuccessfullyDeleted.getText());
        } else {
            System.out.println("No");
        }
    }






}
