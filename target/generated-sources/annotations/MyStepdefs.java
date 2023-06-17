import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^I click on accept Cookies$")
    public void iClickOnAcceptCookies() {
    }

    @Then("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on slingo link$")
    public void iClickOnSlingoLink() {
    }

    @Then("^I can verify the text \"([^\"]*)\"$")
    public void iCanVerifyTheText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
