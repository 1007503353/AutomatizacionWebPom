package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By street = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phoneNumber = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By repeatedPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");

    public void register(String fname, String lname, String str, String cty, String st, String zip, String phone, String ssnNumber, String uname, String pwd) {
        Action.sendData(getDriver(), firstName, fname);
        Action.sendData(getDriver(), lastName, lname);
        Action.sendData(getDriver(), street, str);
        Action.sendData(getDriver(), city, cty);
        Action.sendData(getDriver(), state, st);
        Action.sendData(getDriver(), zipCode, zip);
        Action.sendData(getDriver(), phoneNumber, phone);
        Action.sendData(getDriver(), ssn, ssnNumber);
        Action.sendData(getDriver(), username, uname);
        Action.sendData(getDriver(), password, pwd);
        Action.sendData(getDriver(), repeatedPassword, pwd);
        Action.clicElement(getDriver(), registerButton);
    }
}
