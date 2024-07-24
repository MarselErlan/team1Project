package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StudentsDelete;
import utilities.Driver;

public class StudentsDeleteTest {

    @Test
    public void StudentsTestingFunc() throws InterruptedException {
        StudentsDelete students = new StudentsDelete();

        Driver.getDriver().get("https://batch-6.studymate.us/login");

        students.login.sendKeys("admin@codewise.com");
        students.password.sendKeys("codewise123");
        students.loginBtn.click();

        students.ChooseTeachers.click();
        students.ToremoveIndex1.click();
        students.removeIndex1.click();
        students.confirmRemove.click();
        Thread.sleep(200);

        Assert.assertEquals(students.confirmSuccessfullyDeleted.getText(), "Student successfully deleted");


    }

}
