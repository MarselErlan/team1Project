package tests;

import org.junit.Test;
import pages.StudentsDelete;
import utilities.Driver;

public class StudentsTestDelete {

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
        if (students.confirmSuccessfullyDeleted.getText().equals("Student successfully deleted")) {
            System.out.println("Yes: " + students.confirmSuccessfullyDeleted.getText());
        } else {
            System.out.println("No");
        }

    }

}
