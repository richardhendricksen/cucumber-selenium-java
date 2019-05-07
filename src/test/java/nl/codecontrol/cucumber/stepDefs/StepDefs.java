package nl.codecontrol.cucumber.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.codecontrol.cucumber.pageObjects.ResultPage;
import nl.codecontrol.cucumber.pageObjects.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StepDefs {

    private SearchPage searchPage;
    private ResultPage resultPage;

    public StepDefs() {
        this.searchPage = new SearchPage();
        this.resultPage = new ResultPage();
    }

    @Given("^A user navigates to google$")
    public void aUserNavigatesToGoogle() {
        searchPage.openGoogleSearch();
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchTerm) {
        searchPage.searchFor(searchTerm);

    }

    @Then("^\"([^\"]*)\" is the first in the results$")
    public void isTheFirstInTheResults(String result) {
        assertThat(resultPage.getResult(1), is(result));
    }
}
