package com.virgingames.pages;

import com.virgingames.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlingoPage extends Utility {

    private static final Logger log = LogManager.getLogger(SlingoPage.class.getName());

    public SlingoPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Enjoy the World of Slingo with Virgin Games')]")
    WebElement slingotext;

    public String getSlingoText(){
        log.info("Get Slingo text : " + slingotext.toString());
        return getTextFromElement(slingotext);
    }
}
