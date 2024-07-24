package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.GroupsPage;
import pages.loginPage;
import utilities.Driver;

public class GropsPageTests {

    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage();
    pages.loginPage loginPage = new loginPage();
    GroupsPage groupsPage = new GroupsPage();


    @Test
    public void addGroupTest(){
        driver.get("https://batch-6.studymate.us/login");
        loginPage.testLogin("admin@codewise.com","codewise123","English");
        loginPage.loginButton.click();

        commonPage.groupsPage.click();

        groupsPage.addGroupB8t.click();
        groupsPage.groupNameInput.sendKeys("TEST");
        groupsPage.dateOfGroup.sendKeys("111124");
        groupsPage.descriptionInput.sendKeys("TEST");
        groupsPage.createGroupB8t.click();











    }





}
