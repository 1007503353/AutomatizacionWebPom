package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenAccountPage extends PageObject {
    By openNewAccountLink = By.linkText("Open New Account");
    By accountTypeDropdown = By.id("type");
    By openNewAccountButton = By.xpath("//input[@value='Open New Account']");
    By newAccountId = By.id("newAccountId");

    public void openNewAccount() {
        Action.clicElement(getDriver(), openNewAccountLink);
        Action.clicElement(getDriver(), accountTypeDropdown);
        Action.clicElement(getDriver(), openNewAccountButton);
    }

    public String getNewAccountId() {
        return Action.getElementText(getDriver(), newAccountId);
    }
}
