package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountsOverviewPage extends PageObject {
    By accountsOverviewLink = By.linkText("Accounts Overview");
    By accountsTable = By.id("accountTable");

    public void navigateToAccountsOverview() {
        Action.clicElement(getDriver(), accountsOverviewLink);
    }

    public boolean isAccountDisplayed(String accountId) {
        return Action.getElementText(getDriver(), accountsTable).contains(accountId);
    }
}
