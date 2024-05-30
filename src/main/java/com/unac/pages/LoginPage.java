package com.unac.pages;


import com.unac.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class LoginPage extends PageObject {
    By userName =By.name("uid");
    By password =By.name("password");
    By btnLogin =By.name("btnLogin");
    //By userName3 =By.xpath("//input[@name='uid']");

    public void navegateTo(String url)
    {
        Action.navegateUrl(getDriver(),url);
    }

    public void login(String strUserName, String strPassword)
    {
        Action.sendData(getDriver(), userName, strUserName);
        Action.sendData(getDriver(), password, strPassword);
        Action.clicElement(getDriver(),btnLogin);
    }


}
