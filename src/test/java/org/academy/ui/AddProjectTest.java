package org.academy.ui;

import org.academy.ui.pages.AddProjectPage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.academy.utils.ui.WebConfig;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProjectTest extends BaseTest {
    LoginSteps loginSteps = new LoginSteps();
    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void addProjectTest() throws InterruptedException {
        AddProjectPage addProjectPage = mainPage.clickOnAddProjectBtn()
                .fillNameField(WebConfig.getProjectName())
                .fillAnnouncementField(WebConfig.getProjectAnnouncement());
                addProjectPage.scrollToElement(webDriver, webDriver.findElement(By.id("accept")));
                addProjectPage.clickOnAcceptBtn();

    }
}
