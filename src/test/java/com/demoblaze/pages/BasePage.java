package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();

    }
}
