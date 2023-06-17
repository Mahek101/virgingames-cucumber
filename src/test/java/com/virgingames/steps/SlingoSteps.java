package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.SlingoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SlingoSteps {

    @When("^I click on accept Cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }

    @Then("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on slingo link$")
    public void iClickOnSlingoLink() {
        new HomePage().clickOnSlingo();
    }

    @Then("^I can verify the text \"([^\"]*)\"$")
    public void iCanVerifyTheText(String arg0) {
        String expectedText = "Enjoy the World of Slingo with Virgin Games";
        Assert.assertEquals("Slingo text is not displayed", expectedText, new SlingoPage().getSlingoText());
    }

}
