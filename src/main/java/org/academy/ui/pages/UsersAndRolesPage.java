package org.academy.ui.pages;

import org.openqa.selenium.By;

public class UsersAndRolesPage extends AbstractPage {
    public UsersAndRolesPage() {
        super();
    }

    public UsersAndRolesPage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By addUserBtn = By.xpath("//a[contains(text(),'Add User')]");
    private static final By addMultUserBtn = By.xpath("//a[@class='button button-left button-add btn-left']");

    public AddUserPage clickOnAddUserBtn() {
        waitUntilElementIsClickable(addUserBtn).click();
        return new AddUserPage();
    }
}
