package com.unac.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
    public static void navegateUrl(WebDriver myBrowser, String url) {
        myBrowser.navigate().to(url);
    }

    public static void sendData(WebDriver myBrowser, By target, String strData) {
        myBrowser.findElement(target).sendKeys(strData);
    }

    public static void clicElement(WebDriver myBrowser, By target) {
        myBrowser.findElement(target).click();
    }

    public static String getElementText(WebDriver myBrowser, By target) {
        return myBrowser.findElement(target).getText();
    }
}
