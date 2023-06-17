package com.virgingames.pages;

import com.virgingames.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Slingo')]")
    WebElement slingo;

    public void clickOnAcceptCookies(){
        clickOnElement(acceptCookies);
    }

    public void clickOnSlingo(){
        clickOnElement(slingo);
        log.info("Clicking on slingo link : " + slingo.toString());
    }







}
